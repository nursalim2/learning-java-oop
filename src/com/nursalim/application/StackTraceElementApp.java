package com.nursalim.application;

public class StackTraceElementApp {
    public static void main(String[] args) {
        try {
            String[] names = {"Nursalim", "Milasrun", "Ana"};
            System.out.println(names[100]);
        } catch (Throwable throwable) {
            StackTraceElement[] stackTrace = throwable.getStackTrace();
            throwable.printStackTrace();

        }
    }
}
