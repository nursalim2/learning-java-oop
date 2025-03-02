package com.nursalim.data;

public class Bus implements Car, IsMaintenance{
    @Override
    public void drive() {
        System.out.println("Bus Drive");
    }

    @Override
    public int getTire() {
        return 8;
    }

    @Override
    public boolean isBig() {
        return true;
    }

    @Override
    public String getBrand() {
        return "Hino";
    }

    @Override
    public boolean isMaintenance() {
        return false;
    }
}
