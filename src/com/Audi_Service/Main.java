package com.Audi_Service;

import com.Audi_Service.employees.EmployeeRoster;
import com.Audi_Service.repairOrder.RepairOrderDatabase;

public class Main {

    public static void main(String[] args) {

        EmployeeRoster roster = new EmployeeRoster();
        RepairOrderDatabase repairOrders = new RepairOrderDatabase();

        roster.addEmployee("John", "Smith", 1);
        roster.addEmployee("Jack", "White", 1);
        roster.addEmployee("Ozzy", "Osbourne", 1);

        System.out.println(roster.getEmployee(0));
        System.out.println(roster.getEmployee(1));
        System.out.println(roster.getEmployee(2));


      // this doesn't work because it won't return a technician, only an employee, even though a technician is stored in the
        // array of employees. trying to figure out the proper solution
         repairOrders.generateRO(50, roster.getEmployee(0), "17 character VIN");
        //
    }
}
