package com.Audi_Service.employees;

public class PartsAdvisor extends Employee {

    private int weeklySalary;
    private double commissionRate;
    //parts department number is 1

    public PartsAdvisor(String firstName, String lastName, int department, int employeeNumber, String startDate) {
        super(firstName, lastName, department, employeeNumber, startDate);
        this.weeklySalary = weeklySalary;
        this.commissionRate = commissionRate;
    }

    public int getSalary() {
        return this.weeklySalary;
    }

    public void setSalary(int weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public double getCommissionRate() {
        return this.commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
}
