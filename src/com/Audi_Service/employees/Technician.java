package com.Audi_Service.employees;

import com.Audi_Service.repairOrder.RepairOrder;

import java.util.ArrayList;

public class Technician extends Employee{

    private int flatRate;
    private ArrayList<RepairOrder> assignedRepairOrders;

    private Technician(String firstName, String lastName, int EMPLOYEE_NUMBER, String START_DATE) {
        super(firstName, lastName, EMPLOYEE_NUMBER, START_DATE);
        this.flatRate = 0;
        this.assignedRepairOrders = new ArrayList<>();
    }

    public void setFlatRate(int flatRate) {
        this.flatRate = flatRate;
    }

    public int getFlatRate() {
        return this.flatRate;
    }

    //#TODO add methods for the assignedRepairOrders arrayList
}
