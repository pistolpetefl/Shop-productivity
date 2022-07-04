package com.Audi_Service.repairOrder;


import com.Audi_Service.employees.Department;
import com.Audi_Service.employees.Employee;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class RepairOrder {

    private final int REPAIR_ORDER_NUMBER;
    private String tag; // a 1-4 digit representation of the repair order
    private List<Job> jobs;
    private Scanner reader;
    private final String VIN;
    private OpCodeDatabase opCodes;

    public RepairOrder(int REPAIR_ORDER_NUMBER, String tag, String VIN, OpCodeDatabase opCodes) {
        this.REPAIR_ORDER_NUMBER = REPAIR_ORDER_NUMBER;
        this.tag = tag;
        this.jobs = new ArrayList<>();
        this.reader = new Scanner(System.in);
        this.VIN = VIN;
        this.opCodes = opCodes;
    }

    public void billPart(String partNumber, int jobNumber) {

    }

    public void addJob(String opCode, String description, Employee assignedTechnician) {
        while (true) {
            if (assignedTechnician.getDepartment() != Department.SERVICE) {
                System.out.println("You may only assign service employees to jobs");
            } else {
                Job newJob = new Job(this.opCodes.getOpCode(opCode), description, assignedTechnician);
                this.jobs.add(newJob);
                break;
            }
        }
    }

    public void addJob(String opCode, String description) {
        Job newJob = new Job(this.opCodes.getOpCode(opCode), description);
        this.jobs.add(newJob);
    }

    public void addJob(String opCode) {
        Job newJob = new Job(this.opCodes.getOpCode(opCode));
        this.jobs.add(newJob);
        }


    public void removeJob(Job job) {
        System.out.println("Are you sure you want to delete this job and all of it's contents? (y/n)");
        String answer = reader.nextLine();
        if (answer == "y") {
            this.jobs.remove(job);
            System.out.println("Job successfully removed");
        }
        else {
            System.out.println("The job was NOT removed.");
        }
    }

    public String getTagNumber() {
        return this.tag;
    }

    public int getREPAIR_ORDER_NUMBER() {
        return this.REPAIR_ORDER_NUMBER;
    }

    public void setTag(String newTag) {
        this.tag = newTag;
    }
}
