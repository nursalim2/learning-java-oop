package com.nursalim.application;

import com.nursalim.data.Avanza;
import com.nursalim.data.Car;

public class CarApp {
    public static void main(String[] args) {
        Car avanza = new Avanza();
        avanza.drive();
        System.out.println(avanza.getTire());
        System.out.println(avanza.getBrand());
    }
}
