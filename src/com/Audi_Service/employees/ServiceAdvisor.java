package com.Audi_Service.employees;

public class ServiceAdvisor extends Employee{

    private double commissionRate;
    // service department number is 0

    public ServiceAdvisor(String firstName, String lastName, int department, int employeeNumber, String startDate) {
       super(firstName, lastName, department, employeeNumber, startDate);
       this.commissionRate = 0;
   }

   public double getCommissionRate() {
        return this.commissionRate;
   }

   public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
   }
}
