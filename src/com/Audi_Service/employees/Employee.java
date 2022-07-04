package com.Audi_Service.employees;

public class Employee {

    private String firstName;
    private String lastName;
    private final int EMPLOYEE_NUMBER;
    private final String START_DATE;
    private Department department;

    public Employee (String firstName, String lastName, int EMPLOYEE_NUMBER, String START_DATE) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.EMPLOYEE_NUMBER = EMPLOYEE_NUMBER;
        this.START_DATE = START_DATE;
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

    public void setDepartment(String department) {
        if (department == "parts") {
            this.department = Department.PARTS;
        }
        if (department == "sales") {
            this.department = Department.SALES;
        }
        if (department == "service") {
            this.department = Department.SERVICE;
        }
    }

    public Department getDepartment() {
        return this.department;
    }

    @Override
    public String toString() {
        return ("Name: " + this.firstName + " " + this.lastName + "\n" + "Employee Number: " + this.EMPLOYEE_NUMBER + "\n" + "Start Date: " + this.START_DATE);
    }
}
