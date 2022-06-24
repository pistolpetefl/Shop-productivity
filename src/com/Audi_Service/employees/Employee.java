package com.Audi_Service.employees;

public class Employee {

    private String firstName;
    private String lastName;
    private final int EMPLOYEE_NUMBER;
    private final String START_DATE;
    private String title;

    //#TODO implement the JobTitle enumerator

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

    @Override
    public String toString() {
        return ("Name: " + this.firstName + " " + this.lastName + "\n" + "Employee Number: " + this.EMPLOYEE_NUMBER + "\n" +
                "Job Title: " + this.title + "\n" + "Start Date: " + this.START_DATE);
    }
}
