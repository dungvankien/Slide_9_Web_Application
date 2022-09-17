package com.production.model;

public class Product {
    private int id;
    private String name;
    private double price;
    private String  define;
    private String manufacturer;

    public Product(int id, String name, double price, String define, String manufacturer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.define = define;
        this.manufacturer = manufacturer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDefine() {
        return define;
    }

    public void setDefine(String define) {
        this.define = define;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
