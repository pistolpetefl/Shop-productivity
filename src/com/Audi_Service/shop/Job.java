package com.Audi_Service.shop;

public class Job extends OpCode {

    private String description;
    private int timeUnits; // time units are how much a job will pay. 1 time unit = 1/100 an hour.
    private int jobStatus; // the status of the job (unassigned/open/working/closed) is represented by 0-4 respectively
    private Technician technician;


    public Job(int opCode, String description, int timeUnits, Technician assignedTechnician){
        super(opCode, description, timeUnits);
        this.technician = assignedTechnician;
        this.jobStatus = 1;
    }

    public Job(int opCode, String description, int timeUnits) {
        super(opCode, description, timeUnits);
        this.technician = null;
        this.jobStatus = 0;
    }

    public int getStatus() {
        return this.jobStatus;
    }

    public void setAssignedTechnician(Technician newAssignedTechnician) {
        this.technician = newAssignedTechnician;
    }

    public Technician getAssignedTechnican() {
        return this.technician;
    }

    public void setStatus(int jobStatus) {
        if (jobStatus > 4 || jobStatus < 0) {
            System.out.println("Status change FAILED");
        }
        if (jobStatus == 0) {
            setAssignedTechnician(null);
        }
        this.jobStatus = jobStatus;
    }

    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    public String getDescription() {
        return this.description;
    }

    public void setHours(int timeUnits) {
        this.timeUnits = timeUnits;
    }

    public double getHours() {
        return this.timeUnits;
    }
}
