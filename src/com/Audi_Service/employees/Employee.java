package com.Audi_Service.employees;

public class Employee {

    private String firstName;
    private String lastName;
    private final int EMPLOYEE_NUMBER;
    private final String START_DATE;
    private String title;

    public Employee (String firstName, String lastName, int employeeNumber, String startDate, String title) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.EMPLOYEE_NUMBER = employeeNumber;
        this.START_DATE = startDate;
        this.title = title;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public void setName(String newFirstName, String newLastName) {
        this.firstName = newFirstName;
        this.lastName = newLastName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public int getEmployeeNumber() {
        return this.EMPLOYEE_NUMBER;
    }

    public String getStartDate() {
        return this.START_DATE;
    }

    @Override
    public String toString() {
        return ("Name: " + this.firstName + " " + this.lastName + "\n" + "Employee Number: " + this.EMPLOYEE_NUMBER + "\n" +
                "Job Title: " + this.title + "\n" + "Start Date: " + this.START_DATE);
    }
}
