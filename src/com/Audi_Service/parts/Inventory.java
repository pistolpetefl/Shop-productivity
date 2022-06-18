package com.Audi_Service.parts;

import java.util.Map;
import java.util.HashMap;

public class Inventory {

    private Map<String, Part> partsInventory;

    public Inventory() {
        this.partsInventory = new HashMap<>();
    }

    public void addPart(String partNumber, String description, double cost, double retailPrice, int source, String binLocation) {
        if (!this.partsInventory.containsKey(partNumber)) {
            this.partsInventory.put(partNumber, new Part(partNumber, description, cost, retailPrice, source, binLocation));
        }
        else {
            System.out.println("Part number already on file");
        }
    }
   // if a source isn't provided the source defaults to 212
    public void addPart(String partNumber, String description, double cost, double retailPrice, String binLocation) {
        if (!this.partsInventory.containsKey(partNumber)) {
            this.partsInventory.put(partNumber, new Part(partNumber, description, cost, retailPrice, 212, binLocation));
        }
        else {
            System.out.println("Part number already on file");
        }
    }
    //if a bin isn't provide it defaults to VWSPOR
    public void addPart(String partNumber, String description, double cost, double retailPrice, int source) {
        if (!this.partsInventory.containsKey(partNumber)) {
            this.partsInventory.put(partNumber, new Part(partNumber, description, cost, retailPrice, source,"VWSPOR"));
        }
        else {
            System.out.println("Part number already on file");
        }
    }
    //neither bin nor source are provided
    public void addPart(String partNumber, String description, double cost, double retailPrice) {
        if (!this.partsInventory.containsKey(partNumber)) {
            this.partsInventory.put(partNumber, new Part(partNumber, description, cost, retailPrice, 212, "VWSPOR"));
        }
        else {
            System.out.println("Part number already on file");
        }
    }

    public void receive(String partNumber, int quantity) {
        if (this.partsInventory.containsKey(partNumber)) {

            int x = this.partsInventory.get(partNumber).getQuantity();
            this.partsInventory.get(partNumber).setQuantity(x + quantity);
        }
    }

    public Part getPart(String partNumber) {
        if (this.partsInventory.containsKey((partNumber))) {
            return this.partsInventory.get(partNumber);
        }
        else {
            return null;
        }
    }
}
