package com.Audi_Service.employees;

import java.util.List;
import java.util.ArrayList;
import com.Audi_Service.repairOrder.RepairOrder;

public class ServiceAdvisor extends Employee{

    private double commissionRate;
    private List<RepairOrder> openRepairOrders;

    public ServiceAdvisor(String firstName, String lastName, int EMPLOYEE_NUMBER, String START_DATE) {
       super(firstName, lastName, EMPLOYEE_NUMBER, START_DATE);
       this.commissionRate = 0;
       this.openRepairOrders = new ArrayList<>();
   }

   //#TODO implement the openRepairOrders methods

   public double getCommissionRate() {
        return this.commissionRate;
   }

   public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
   }
}
