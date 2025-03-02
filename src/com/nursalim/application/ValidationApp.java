package com.nursalim.application;

import com.nursalim.data.LoginRequest;
import com.nursalim.error.ValidationException;
import com.nursalim.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest);

        try {
            ValidationUtil.validate(loginRequest);
        } catch (ValidationException | NullPointerException e) {
            System.out.println("Terjadi kesalahan : " + e.getMessage());;
        } finally {
            System.out.println("Allways call either error or not");
        }
    }
}
