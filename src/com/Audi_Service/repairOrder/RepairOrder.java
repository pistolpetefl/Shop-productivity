package com.Audi_Service.repairOrder;


import com.Audi_Service.employees.ServiceAdvisor;
import com.Audi_Service.employees.Technician;
import com.Audi_Service.parts.Part;
import com.Audi_Service.repairOrder.Job;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class RepairOrder {

    private final int REPAIR_ORDER_NUMBER;
    private int tag; // a 1-4 digit representation of the repair order
    private ServiceAdvisor serviceAdvisor;
    private List<Job> jobs;
    private Scanner reader;
    private final String VIN;


    public RepairOrder(int REPAIR_ORDER_NUMBER, int tag, String VIN) {
        this.REPAIR_ORDER_NUMBER = REPAIR_ORDER_NUMBER;
        this.tag = tag;
        this.jobs = new ArrayList<>();
        this.reader = new Scanner(System.in);
        this.VIN = VIN;
    }

    public void billPart(String partNumber) {

    }

    public void addJob(int opCode, String description, Technician assignedTechnician) {

        Job newJob = new Job(opCode, description, assignedTechnician); //commented out due to my
        this.jobs.add(newJob); //technician retrieval issue i posted to reddit
        }

    public void addJob(int opCode, String description) {
        Job newJob = new Job(opCode, description);
        this.jobs.add(newJob);
    }

    //public void addJob() {
      //  Job newJob = new Job();
       // }


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

    public void setTag(int newTag) {
        this.tag = newTag;
    }

}
