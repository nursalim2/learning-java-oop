package com.nursalim.application;

import com.nursalim.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase(null, null);
    }

    static void connectDatabase(String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("Tidak bisa connect database");
        }
    }
}
