package com.production.service;

import com.production.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService{
    private static Map<Integer, Product> productList;
    static {
        productList = new HashMap<>();
        productList.put(1,(new Product(111,"bia zorock",15000,"Thơm, nhẹ","AB")));
        productList.put(2,(new Product(112,"bia Ab",15000,"Thơm, nhẹ","AB")));
        productList.put(3,(new Product(113,"bia corona",15000,"Thơm, nhẹ","AB")));
        productList.put(4,(new Product(114,"bia special",15000,"Thơm, nhẹ","AB")));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productList.values());
    }

    @Override
    public void save(Product product) {
        productList.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        return productList.get(id);
    }

    @Override
    public Product findByName(String name) {
        return productList.get(name);
    }

    @Override
    public void update(int id, Product product) {
        productList.put(id,product);
    }

    @Override
    public void remove(int id) {
        productList.remove(id);
    }
}
