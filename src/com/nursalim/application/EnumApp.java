package com.nursalim.application;

import com.nursalim.data.Level;

class Customer {
    String name;
    Level level;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Nursalim");
        customer.setLevel(Level.VIP);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        Level[] levels = Level.values();
        for (var value : levels) {
            System.out.println(value);
        }
    }
}
