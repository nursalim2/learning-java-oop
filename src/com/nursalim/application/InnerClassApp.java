package com.nursalim.application;

import com.nursalim.data.Company;

public class InnerClassApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("PT. Nursalim Milasrun");

        Company.Employee employee = company.new Employee();
        employee.setName("Ana Fauziah");

        System.out.println(employee.getCompany());
        System.out.println(employee.getName());

    }
}
