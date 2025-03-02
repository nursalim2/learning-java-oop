package com.nursalim.data;

public class Avanza implements Car, IsMaintenance {
    @Override
    public void drive() {
        System.out.println("Drive Avaza");
    }

    @Override
    public int getTire() {
        return 4;
    }

    @Override
    public String getBrand() {
        return "Toyota";
    }

    @Override
    public boolean isMaintenance() {
        return false;
    }
}
