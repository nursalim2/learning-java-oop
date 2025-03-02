package com.nursalim.application;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Nursalim";
        first = first + " " + "Milasrun";

        System.out.println(first);
        String second = "Nursalim Milasrun";
        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));

        String third = "Nursalim Milasrun";
        System.out.println(second == third);
    }
}
