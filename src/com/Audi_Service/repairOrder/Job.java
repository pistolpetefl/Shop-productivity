package com.Audi_Service.repairOrder;

import java.util.List;
import java.util.ArrayList;

import com.Audi_Service.employees.Technician;
import com.Audi_Service.parts.Part;

public class Job{

    private String description;
    private int jobStatus; // the status of the job (unassigned/open/working/closed) is represented by 0-4 respectively
    private Technician technician;
    private List<Part> partsList;

//making oPcodes function needs work - the opcode database and opcode class are not written properly
    public Job(int opCode, String description, Technician assignedTechnician){
        (opCode, description);
        this.technician = assignedTechnician;
        this.jobStatus = 1;
        this.partsList = new ArrayList<>();
    }

    public Job(int opCode, String description) {
        (opCode, description);
        this.technician = null;
        this.jobStatus = 0;
        this.partsList = new ArrayList<>();
    }

    public Job() {

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

    public void addPartToJob(String partNumber) {

    }

    public ArrayList getPartsList() {
        return (ArrayList) this.partsList;
    }

    public Technician getAssignedTechnician() {
        return this.technician;
    }

    public void setAssignedTechnician(Technician newAssignedTechnician) {
        this.technician = newAssignedTechnician;
    }

    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    public String getDescription() {
        return this.description;
    }

    public int getStatus() {
        return this.jobStatus;
    }

}
