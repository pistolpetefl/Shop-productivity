package com.Audi_Service.parts;

public class Part {

    private final String PART_NUMBER;
    private String description;
    private int quantity; //not sure which class to put quantity information in yet
    private double cost;
    private double retailPrice;
    private int source;
    private String binLocation;

    public Part (String partNumber, String description, double cost, double retailPrice, int source, String binLocation) {
        this.PART_NUMBER = partNumber;
        this.description = description;
        this.cost = cost;
        this.retailPrice = retailPrice;
        this.source = source;
        this.quantity = 0;
        this.binLocation = binLocation;
    }

    public String getPartNumber() {
        return this.PART_NUMBER;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return this.cost;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public double getRetailPrice() {
        return this.retailPrice;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public int getSource() {
        return this.source;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setBin(String bin) {
        this.binLocation = bin;
    }

    public String getBin() {
        return this.binLocation;
    }
}
