package com.example.listofcustomers;

public class Customers {
       private String fullName;
       private String birthDate;
       private String address;
       private String image;

    public Customers(String fullName, String birthDate, String address, String image) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.address = address;
        this.image = image;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
