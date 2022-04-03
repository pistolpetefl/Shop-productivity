package com.Audi_Service.shop;

import com.Audi_Service.logic.OpCodeDatabase;
import com.Audi_Service.logic.EmployeeRoster;



import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class RepairOrder {

    private final int REPAIR_ORDER_NUMBER;
    private int tag; // a 1-4 digit representation of the repair order
    private Technician technician;
    private ServiceAdvisor serviceAdvisor;
    private List<Job> jobs;
    private Scanner reader;


    public RepairOrder(int repairOrderNumber, int tag, Technician technician) {
        this.REPAIR_ORDER_NUMBER = repairOrderNumber;
        this.tag = tag;
        this.technician = technician;
        this.jobs = new ArrayList<>();
        this.reader = new Scanner(System.in);
    }

    public RepairOrder(int REPAIR_ORDER_NUMBER, int tag) {
        this.REPAIR_ORDER_NUMBER = REPAIR_ORDER_NUMBER;
        this.tag = tag;
        this.jobs = new ArrayList<>();
        this.reader = new Scanner(System.in);
    }

    public void addJob(int opCode, Technician assignedTechnician) {

           // Job newJob = new Job(, hours, assignedTechnician);
         //   this.jobs.add(newJob);
        }


    public void addJob(String description, double hours) {
        //    Job newJob = new Job(description, hours);
        //    this.jobs.add(newJob);
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

    public int getTag() {
        return this.tag;
    }

    public int getRO() {
        return this.REPAIR_ORDER_NUMBER;
    }

    public Technician getTechnician() {
        return this.technician;
    }

    public void setTag(int newTag) {
        this.tag = newTag;
    }

    public void setTechnician(Technician newTechnician) {
        this.technician = newTechnician;
    }
}
