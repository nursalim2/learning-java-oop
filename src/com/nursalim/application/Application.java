package com.nursalim.application;

import com.nursalim.data.Product;

public class Application {
    public static void main(String[] args) {
        Product product = new Product("Samsung Galaxy Pro", 100000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
