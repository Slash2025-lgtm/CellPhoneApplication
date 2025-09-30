package com.pluralsight;

import java.util.Scanner;

public class CellPhone {
    Scanner keyboard = new Scanner(System.in);

    private String serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone (String serialNumber, String model, String carrier, String phoneNumber, String owner) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

    public void display(String serialNumber, String model, String carrier, String phoneNumber, String owner) {
        System.out.printf("Serial Number: %s\nModel: %s\nCarrier: %s\nPhone Number: %s\nOwner: %s", serialNumber, model, carrier, phoneNumber, owner);
    }

}
