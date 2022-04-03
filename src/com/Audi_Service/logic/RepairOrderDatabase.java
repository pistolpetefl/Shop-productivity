package com.Audi_Service.logic;

import com.Audi_Service.shop.RepairOrder;
import com.Audi_Service.shop.Technician;

import java.util.List;
import java.util.ArrayList;

public class RepairOrderDatabase {

    private List<RepairOrder> repairOrderList;
    private int repairOrderNumber;

    public RepairOrderDatabase() {
        this.repairOrderList = new ArrayList<>();
        this.repairOrderNumber = 0;
    }

    public void generateRO(int tag, Technician techNumber) {
        this.repairOrderList.add(new RepairOrder(repairOrderNumber, tag, techNumber));
        this.repairOrderNumber++;
    }
}
