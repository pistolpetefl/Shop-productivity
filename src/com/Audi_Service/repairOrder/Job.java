//#TODO add all of the JobStatus setters and test the getter
//#TODO fix the opcode retrieval and continue to implement it's functionality

package com.Audi_Service.repairOrder;

import java.util.List;
import java.util.ArrayList;

import com.Audi_Service.employees.Technician;
import com.Audi_Service.parts.Part;

public class Job{

    private JobStatus status;
    public enum JobStatus {
        UNASSIGNED,
        PREASSIGNED,
        HOLD,
        WORK,
        FINISHED;
    }

    private String description;
    private Technician technician;
    private List<Part> partsList;

//making oPcodes function needs work - the opcode database and opcode class are not written properly -- done?
    //opcode and opcodedatabase classes should be written correctly, now the jobs class needs to access them correctly.
    //this is not a tonight problem to solve
    public Job(int opCode, String description, Technician assignedTechnician) {
        this(opCode, description);
        this.technician = assignedTechnician;
        this.status = JobStatus.PREASSIGNED;
        this.partsList = new ArrayList<>();
    }

    public Job(int opCode, String description) {
        this.opCode = opCode;
        this.description = description;
        this.technician = null;
        this.status = JobStatus.UNASSIGNED;
        //this.partsList = new ArrayList<>();
    }

    public Job() {

    }

    public void setStatusToHold() {
        if (this.technician != null) {
            this.status = JobStatus.HOLD;
        }
    }

    public void setStatusToWork() {
        this.status = JobStatus.WORK;
    }

    public void setStatusToFinished() {
        this.status = JobStatus.FINISHED;
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

    public JobStatus getStatus() {
        return this.status;
    }

}
