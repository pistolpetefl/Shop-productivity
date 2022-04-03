package com.Audi_Service.shop;



public class OpCode {  //OP codes or Operation Codes are pre-built jobs, they have a pre-set description and time among other things.
    // the idea will be to implement OP codes as to select them when adding a new job to a repair order,
    // that way a bulk of the information is filled for us. These act as a blueprint for a job, but the job fields must
    // remain dynamic as OP codes act as a guideline

    private int opCode;
    private String title;
    private String description;
    private int timeUnits;

    public OpCode(int codeNumber, String title, int timeUnits) {
        this.opCode = opCode;
        this.title = title;
        this.timeUnits = timeUnits;
    }

    public int getOpCode() {
        return this.opCode;
    }
}
