package com.Audi_Service.employees;

public class PartsAdvisor extends Employee {

    private int weeklySalary;
    private double commissionRate;

    public PartsAdvisor(String firstName, String lastName, int EMPLOYEE_NUMBER, String START_DATE) {
        super(firstName, lastName, EMPLOYEE_NUMBER, START_DATE);
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
