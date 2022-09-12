package com.example.listofcustomers;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "listCustomersServlet", value = "/index")
public class ListCustomersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customers> customersList = new ArrayList<Customers>();
        customersList.add(new Customers("Mai van Hoan","20-03-1990","Hà Nội","http://nguyenvinhdigital.com/profiles/nguyenvinhdigitalcom/uploads/attach/1506410973_anhthe.jpg"));
        customersList.add(new Customers("Mai van Hoai","20-03-1990","Hà Nội","http://nguyenvinhdigital.com/profiles/nguyenvinhdigitalcom/uploads/attach/1506410973_anhthe.jpg"));
        customersList.add(new Customers("Mai van Lam","20-03-1990","Hà Nội","http://nguyenvinhdigital.com/profiles/nguyenvinhdigitalcom/uploads/attach/1506410973_anhthe.jpg"));
        customersList.add(new Customers("Mai van Tinh","20-03-1990","Hà Nội","http://nguyenvinhdigital.com/profiles/nguyenvinhdigitalcom/uploads/attach/1506410973_anhthe.jpg"));
        customersList.add(new Customers("Mai van Tân","20-03-1990","Hà Nội","http://nguyenvinhdigital.com/profiles/nguyenvinhdigitalcom/uploads/attach/1506410973_anhthe.jpg"));
        customersList.add(new Customers("Mai van Hoi","20-03-1990","Hà Nội","http://nguyenvinhdigital.com/profiles/nguyenvinhdigitalcom/uploads/attach/1506410973_anhthe.jpg"));

        request.setAttribute("customersList",customersList);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
        dispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }
}
