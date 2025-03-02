package com.nursalim.util;

import com.nursalim.annotation.NotBlank;
import com.nursalim.data.LoginRequest;
import com.nursalim.error.BlankException;
import com.nursalim.error.ValidationException;

import java.lang.reflect.Field;

public class ValidationUtil {
    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username cannot null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationException("Username cannot empty");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password cannot null");
        } else if (loginRequest.password().isBlank()) {
            throw new ValidationException("Password cannot empty");
        }
    }

    public static void validateRuntime(LoginRequest loginRequest) {
        if (loginRequest.username() == null) {
            throw new BlankException("Username cannot null");
        } else if (loginRequest.username().isBlank()) {
            throw new BlankException("Username cannot empty");
        } else if (loginRequest.password() == null) {
            throw new BlankException("Password cannot null");
        } else if (loginRequest.password().isBlank()) {
            throw new BlankException("Password cannot empty");
        }
    }

    public static void validationReflection(Object object) throws IllegalAccessException, ValidationException {
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field: fields) {
            if (field.getAnnotation(NotBlank.class) != null) {
                field.setAccessible(true);
                String value = (String) field.get(object);

                if (value == null || value.isBlank()) {
                    throw new ValidationException("Field " + field.getName() + " is blank");
                }
            }
        }
    }
}
