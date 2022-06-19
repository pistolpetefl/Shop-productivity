package com.Audi_Service.repairOrder;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OpCodeDatabase {

    private Map<Integer, OpCode> opCodeList;
    private Scanner reader = new Scanner(System.in);

    public OpCodeDatabase(Map opCodeList) {
        this.opCodeList = new HashMap();
    }

    public void generateOpCode(int codeNumber, String title, String description) {

        if (!this.opCodeList.containsKey(codeNumber)) {
            this.opCodeList.put(codeNumber, new OpCode(codeNumber, title, description));
        }
        else {
            System.out.println("This Op code is already taken, would you like to overwrite it? (y/n)");
            String answer = reader.nextLine();
            answer.toLowerCase();
            answer.trim();
            if (answer == "y") {
                System.out.println("Enter the header: ");
                String newTitle = reader.nextLine();
                String newDescription = reader.nextLine();
                this.opCodeList.replace(codeNumber, new OpCode(codeNumber, newTitle, newDescription));
            }
            else {
                System.out.println("The Op code was NOT overwritten");
            }
        }
    }

    public OpCode getOpCode(int opCodeNumber) {
        return this.opCodeList.get(opCodeNumber);
    }
}
