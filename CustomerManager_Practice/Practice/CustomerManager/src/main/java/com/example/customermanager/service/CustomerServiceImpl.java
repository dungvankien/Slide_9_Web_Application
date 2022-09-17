package com.example.customermanager.service;

import com.example.customermanager.model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerServiceImpl implements DaoInterface<Customer>  {

    private static final String INSERT_USERS_SQL = "INSERT INTO users (name, email, address) VALUES (?, ?, ?);";
    private static final String SELECT_USER_BY_ID = "select id,name,email,address from users where id = ?";
    private static final String SELECT_ALL_USERS = "select * from users";
    private static final String DELETE_USERS_SQL = "delete from users where id = ?;";
    private static final String UPDATE_USERS_SQL = "update users set name = ?,email= ?, address = + ? where id = ?;";
    private static final String SELECT_USER_BY_CONDITION = "select id, name, email, address from users where name = ?;";

    @Override
    public int insert(Customer customer) {
        int result=0;
       try {
           Connection connection = JDBCUtil.getConnection();
           PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);
           preparedStatement.setString(1, customer.getName());
           preparedStatement.setString(2, customer.getEmail());
           preparedStatement.setString(3, customer.getAddress());
           result = preparedStatement.executeUpdate();
           JDBCUtil.closeConnection(connection);
       } catch (SQLException e){
           e.printStackTrace();
       }
       return result;
    }

    @Override
    public int update(Customer customer) {
        int result = 0;
        try {
            Connection connection = JDBCUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USERS_SQL);
            preparedStatement.setString(1, customer.getName());
            preparedStatement.setString(2,customer.getEmail());
            preparedStatement.setString(3, customer.getAddress());
            preparedStatement.setInt(4,customer.getId());
            result = preparedStatement.executeUpdate();
            JDBCUtil.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int delete(int id) {
        int result = 0;
        try {
            Connection connection = JDBCUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USERS_SQL);
            preparedStatement.setInt(1,id);
            result = preparedStatement.executeUpdate();
            JDBCUtil.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public ArrayList<Customer> selectAll() {
        ArrayList<Customer> result = new ArrayList<>();
        try {
            Connection connection = JDBCUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getNString("name");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                Customer customer = new Customer(id,name,email,address);
                result.add(customer);
            }
            JDBCUtil.closeConnection(connection);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public Customer selectById(int id) {
        Customer result = null;
        try {
            Connection connection = JDBCUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int idItem = resultSet.getInt("id");
                String name = resultSet.getNString("name");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                result = new Customer(idItem, name, email, address);
            }
            JDBCUtil.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public ArrayList<Customer> selectByCondition(String condition) {
        ArrayList<Customer> result = new ArrayList<>();
        try {
            Connection connection = JDBCUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_CONDITION);
            preparedStatement.setString(1,condition);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getNString("name");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                Customer customer = new Customer(id,name,email,address);
                result.add(customer);
            }
            JDBCUtil.closeConnection(connection);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
