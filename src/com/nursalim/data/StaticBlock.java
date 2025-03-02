package com.nursalim.data;

public class StaticBlock {
    public static final int PROCCESSOR;

    static {
        System.out.println("Mengakses class StaticBlockApp");
        PROCCESSOR = Runtime.getRuntime().availableProcessors();
    }
}
