package com.nursalim.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Samsung Galaxy Pro", 100000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
