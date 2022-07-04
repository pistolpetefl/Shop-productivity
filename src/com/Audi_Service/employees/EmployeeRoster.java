package com.Audi_Service.employees;

import com.Audi_Service.employees.Employee;
import com.Audi_Service.employees.PartsAdvisor;
import com.Audi_Service.employees.ServiceAdvisor;
import com.Audi_Service.employees.Technician;

import java.util.HashMap;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class EmployeeRoster {

    private Map<Integer, Employee> employeeRoster; //Integer will be the employee number
    private int employeeNumber;
    private SimpleDateFormat dateFor;

    public EmployeeRoster() {
        this.employeeRoster = new HashMap<>();
        this.employeeNumber = 0;
        this.dateFor = new SimpleDateFormat("MM/dd/yyyy");
    }

    public void addEmployee(String firstName, String lastName) {
        String stringDate = dateFor.format(new Date());
        this.employeeRoster.put(this.employeeNumber, new Employee(firstName, lastName, this.employeeNumber, stringDate));
        this.employeeNumber++;
    }

    public Employee getEmployee(int employeeNumber) {
        return this.employeeRoster.get(employeeNumber);
    }

}
