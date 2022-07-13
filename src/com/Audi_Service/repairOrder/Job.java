//#TODO add all of the JobStatus setters and test the getter
//#TODO fix the opcode retrieval and continue to implement it's functionality

package com.Audi_Service.repairOrder;

import java.util.List;
import java.util.ArrayList;

import com.Audi_Service.employees.Employee;
import com.Audi_Service.parts.Inventory;
import com.Audi_Service.parts.Part;

public class Job{

    private JobStatus workStatus;
    public enum JobStatus { //set status methods need to be condensed if possible
        UNASSIGNED,
        PREASSIGNED,
        HOLD,
        WORK,
        FINISHED
    }

    private String description;
    private Employee assignedTechnician;
    private List<Part> partsList; //change to handle Parts instead of Strings?
    //private OpCode opCode; i removed opCode variables and replaced them with opCodeNumber variables
    private String opCodeNumber; // i think that's what I want?
    private static Inventory inventory; // check this and why it works or if it works

    public Job(OpCode opCode, Employee assignedTechnician) {
        this.opCodeNumber = opCode.getOpCodeNumber();
        this.description = opCode.getDescription();
        this.assignedTechnician = assignedTechnician;
        this.workStatus = JobStatus.PREASSIGNED;
        this.partsList = new ArrayList<>();
    }

    public Job(OpCode opCode) {
        this.opCodeNumber = opCode.getOpCodeNumber();
        this.description = opCode.getDescription();
        this.assignedTechnician = null;
        this.workStatus = JobStatus.UNASSIGNED;
        this.partsList = new ArrayList<>();
    }

    public void setStatusToHold() {
        if (this.assignedTechnician != null) {
            this.workStatus = JobStatus.HOLD;
        }
    }

    public void setStatusToWork() {
        this.workStatus = JobStatus.WORK;
    }

    public void setStatusToFinished() {
        this.workStatus = JobStatus.FINISHED;
    }

    public void setStatusToUnassigned() {
        this.workStatus = JobStatus.UNASSIGNED;
    }

    public void addPartToJob(String partNumber) { //review this method
        if (inventory.getInventory().containsKey(partNumber)) {
            this.partsList.add(inventory.getPart(partNumber)); // not sure how i will address quantity yet -
            //maybe when the gui asks how many, just have it access the object that handles the quantity
        }
    }

    public void removePartFromJob(Part partNumber) {
        if (partsListContainsPart(partNumber)) {
            this.partsList.remove(partNumber);
        }
    }

    public boolean partsListContainsPart(Part partNumber) {
        return this.partsList.contains(partNumber);
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

    public JobStatus getWorkStatus() {
        return this.workStatus

    }

    public String toString() {
        return getWorkStatus()
                //opcode, description, employee, parts
    }
}
