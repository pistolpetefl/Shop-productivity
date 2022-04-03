package com.Audi_Service.shop;

import java.util.ArrayList;

public class Technician extends Employee{

    private int flatRate;
    private ArrayList<RepairOrder> assignedRepairOrders;
    // service department number is 0

    public Technician(String firstName, String lastName, int department, int employeeNumber, String startDate) {
        super(firstName, lastName, department,employeeNumber, startDate);
        this.flatRate = 0;
        this.assignedRepairOrders = new ArrayList<>();
    }

    public void setFlatRate(int flatRate) {
        this.flatRate = flatRate;
    }

    public int getFlatRate() {
        return this.flatRate;
    }


}
