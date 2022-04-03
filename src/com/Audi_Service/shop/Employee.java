package com.Audi_Service.shop;

import com.Audi_Service.logic.Departments;

public class Employee {

    private String firstName;
    private String lastName;
    private final int EMPLOYEE_NUMBER;
    private final String START_DATE;
    private int department;
    private Departments departmentList;

    public Employee (String firstName, String lastName, int department ,int employeeNumber, String startDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.EMPLOYEE_NUMBER = employeeNumber;
        this.START_DATE = startDate;
        this.department = department;
        this.departmentList = new Departments();
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public void setName(String newFirstName, String newLastName) {
        this.firstName = newFirstName;
        this.lastName = newLastName;
    }

    public int getEmployeeNumber() {
        return this.EMPLOYEE_NUMBER;
    }

    public String getStartDate() {
        return this.START_DATE;
    }

    public int getDepartment() {
        return this.department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {public
        return ("Name: " + this.firstName + " " + this.lastName + "\n" + "Employee Number: " + this.EMPLOYEE_NUMBER + "\n" +
                "Department: " + this.departmentList.getDepartment(this.department) + "\n" + "Start Date: " + this.START_DATE);
    }
}
