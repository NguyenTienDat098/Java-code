package com.dev.Product;

import java.util.Scanner;

public class Product {
    private String productName;
    private double price;


    /*
        CONSTRUCTOR
    */
    public Product(String productName, double price){
        this.productName = productName;
        this.price = price;
    }

    public Product(){
        this(null, 0);
    }

   //SET
    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    // GET
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
