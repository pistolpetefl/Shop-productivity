package com.Audi_Service.repairOrder;



public class OpCode {  //OP codes or Operation Codes are pre-built jobs, they have a pre-set description and time among other things.
    // the idea will be to implement OP codes as to select them when adding a new job to a repair order,
    // that way a bulk of the information is filled for us. These act as a blueprint for a job, but the job fields must
    // remain dynamic as OP codes act as a guideline

    private String opCodeNumber;
    private String title;
    private String description;
    private int timeUnits;

    public OpCode(String opCodeNumber, String title, String description, int timeUnits) {
        this.opCodeNumber = opCodeNumber;
        this.title = title;
        this.description = description;
        this.timeUnits = timeUnits;
    }

    public OpCode(String opCodeNumber, String title, String description) {
        this(opCodeNumber, title, description, 0);
    }

    public String getOpCodeNumber() {
        return this.opCodeNumber;
    }

    private void setOpCodeNumber(String opCodeNumber) {
        this.opCodeNumber = opCodeNumber;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTimeUnits(int timeUnits) {
        this.timeUnits = timeUnits;
    }

    public int getTimeUnits() {
        return this.timeUnits;
    }
}
