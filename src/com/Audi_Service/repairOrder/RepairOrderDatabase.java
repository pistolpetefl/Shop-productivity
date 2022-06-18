package com.Audi_Service.repairOrder;

import com.Audi_Service.employees.Technician;

import java.util.Map;
import java.util.HashMap;

public class RepairOrderDatabase {

    private Map<Integer, RepairOrder> repairOrderList;
    private int repairOrderNumber;

    public RepairOrderDatabase() {
        this.repairOrderList = new HashMap<>();
        this.repairOrderNumber = 0;
    }

    public void generateRO(int tag, String VIN) {
        while (true) {
            if (tag > 9999) {
                System.out.println("4 character tag number maximum");
            }
            if (VIN.length() != 17 ) {
                System.out.println("VIN's must be 17 characters");
            }
            else {
                break;
            }
        }
        this.repairOrderNumber++;
        this.repairOrderList.put(this.repairOrderNumber, new RepairOrder(repairOrderNumber, tag, VIN));
    }
    public RepairOrder getRepairOrder(int repairOrderNumber) {
        return this.repairOrderList.get(repairOrderNumber);
    }
}
