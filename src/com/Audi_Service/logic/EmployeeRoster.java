package com.Audi_Service.logic;

import com.Audi_Service.shop.Employee;
import com.Audi_Service.shop.PartsAdvisor;
import com.Audi_Service.shop.ServiceAdvisor;
import com.Audi_Service.shop.Technician;

import java.util.HashMap;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class EmployeeRoster {

    private Map<Integer, Employee> employeeRoster; //Integer will be the employee number
    private int employeeNumber;
    private SimpleDateFormat dateFor;
    private int Department; // let 0, 1, 2, and 3 represent service advisors, technicians, parts advisors, and salesmen

    public EmployeeRoster() {
        this.employeeRoster = new HashMap<>();
        this.employeeNumber = 0;
        this.dateFor = new SimpleDateFormat("MM/dd/yyyy");
    }

    public void addEmployee(String firstName, String lastName, int department) {
        String stringDate = dateFor.format(new Date());
        if (department == 0) {
            this.employeeRoster.put(this.employeeNumber, new ServiceAdvisor(firstName, lastName, department, this.employeeNumber, stringDate));
            this.employeeNumber++;
        }
        else if (department == 1) {
            this.employeeRoster.put(this.employeeNumber, new Technician(firstName, lastName, department, this.employeeNumber, stringDate));
            this.employeeNumber++;
        }
        else if (department == 3 ) {
            this.employeeRoster.put(this.employeeNumber, new PartsAdvisor(firstName, lastName, department, this.employeeNumber, stringDate));
            this.employeeNumber++;
        }
        // else if (department == 4) {
        //       this.employeeRoster.put(this.employeeNumber, new Salesman(firstName, lastName, department, this.employeeNumber, stringDate));
        //       }
                else {
            System.out.println("Invalid Selection");
        }
    }
    /*public void addEmployee(String firstName, String lastName, int department) {
        String stringDate = dateFor.format(new Date());
        this.employeeRoster.put(this.employeeNumber, new Employee(firstName, lastName, department, this.employeeNumber, stringDate));
        this.employeeNumber++;
    }*/

    public Employee getEmployee(int employeeNumber) {
        return this.employeeRoster.get(employeeNumber);
    }

    public Technician getTechnician(int employeeNumber) {
        return this.employeeRoster.get(employeeNumber);
    }

}