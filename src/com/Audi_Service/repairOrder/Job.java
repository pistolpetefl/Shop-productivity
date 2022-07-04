//#TODO add all of the JobStatus setters and test the getter
//#TODO fix the opcode retrieval and continue to implement it's functionality

package com.Audi_Service.repairOrder;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

import com.Audi_Service.employees.Employee;
import com.Audi_Service.parts.Part;

public class Job{

    private JobStatus status;
    public enum JobStatus {
        UNASSIGNED,
        PREASSIGNED,
        HOLD,
        WORK,
        FINISHED
    }

    private String description;
    private Employee assignedTechnician;
    private List<Part> partsList;
    private OpCode opCode;
    private HashMap<String, Part> partsInventory;

    public Job(OpCode opCode, String description, Employee assignedTechnician) {
        this(opCode, description);
        this.assignedTechnician = assignedTechnician;
        this.status = JobStatus.PREASSIGNED;
        this.partsList = new ArrayList<>();
    }

    public Job(OpCode opCode, String description) {
        this.opCode = opCode;
        this.description = description;
        this.assignedTechnician = null;
        this.status = JobStatus.UNASSIGNED;
        this.partsList = new ArrayList<>();
    }

    public Job(OpCode opCode, Employee assignedTechnician) {
        this.opCode = opCode;
        this.assignedTechnician = assignedTechnician;
        this.status = JobStatus.PREASSIGNED;
        this.partsList = new ArrayList<>();
    }

    public Job(OpCode opCode) {
        this.opCode = opCode;
        this.description = null;
        this.assignedTechnician = null;
        this.status = JobStatus.UNASSIGNED;
        this.partsList = new ArrayList<>();
    }

    public void setStatusToHold() {
        if (this.assignedTechnician != null) {
            this.status = JobStatus.HOLD;
        }
    }

    public void setStatusToWork() {
        this.status = JobStatus.WORK;
    }

    public void setStatusToFinished() {
        this.status = JobStatus.FINISHED;
    }

    public void addPartToJob(Part partNumber) {

    }

    public ArrayList getPartsList() {
        return (ArrayList) this.partsList;
    }

    public Employee getAssignedTechnician() {
        return this.assignedTechnician;
    }

    public void setAssignedTechnician(Employee newAssignedTechnician) {
        this.assignedTechnician = newAssignedTechnician;
    }

    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    public String getDescription() {
        return this.description;
    }

    public JobStatus getStatus() {
        return this.status;
    }

}
