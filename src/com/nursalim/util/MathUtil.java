package com.nursalim.util;

public class MathUtil {
    public static int sum(int... values) {
        int result = 0;
        for(var value : values) {
            result += value;
        }
        return result;
    }
}
