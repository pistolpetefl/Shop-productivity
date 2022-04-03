package com.Audi_Service.logic;

import com.Audi_Service.shop.OpCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OpCodeDatabase {

    private Map<Integer, OpCode> opCodeList;
    private Scanner reader;

    public OpCodeDatabase(Map opCodeList) {
        this.opCodeList = new HashMap();
        this.reader = new Scanner(System.in);
    }

    public void addOpCode(int codeNumber) {
        //TODO# SHOULD THIS BE AN ARRAYLIST OR HASHMAP?
        if (!this.opCodeList.containsKey(codeNumber)) {
            System.out.println("Enter the header: ");
            String title = reader.nextLine();
            System.out.println("Enter the flat rate in time units: "); //1 time unit = 1/100 of an hour.
            int timeUnits = Integer.parseInt(reader.nextLine());
            this.opCodeList.put(codeNumber, new OpCode(codeNumber, title, timeUnits));
        }
        else {
            System.out.println("This Op code is already taken, would you like to overwrite it? (y/n)");
            String answer = reader.nextLine();
            answer.toLowerCase();
            answer.trim();
            if (answer == "y") {
                System.out.println("Enter the header: ");
                String title = reader.nextLine();
                System.out.println("Enter the flat rate in time units: ");
                int timeUnits = Integer.parseInt(reader.nextLine());
                this.opCodeList.replace(codeNumber, new OpCode(codeNumber, title, timeUnits));
            }
            else {
                System.out.println("The Op code was NOT overwritten");
            }
        }
    }
}
