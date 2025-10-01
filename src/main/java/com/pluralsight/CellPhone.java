package com.pluralsight;

import java.util.Scanner;

public class CellPhone {
    Scanner keyboard = new Scanner(System.in);

    private String serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;
    private int selected;
    private String receiverPhoneNumber;

    public CellPhone () {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
        this.selected = selected;
        this.receiverPhoneNumber = receiverPhoneNumber;
    }

    public CellPhone (String serialNumber, String model, String carrier, String phoneNumber, String owner) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

    public void info() {
        System.out.println("CellPhoneApp [Open]");
        System.out.print("Enter Serial Number: ");
        serialNumber = keyboard.nextLine();

        System.out.print("Enter the Model: ");
        model = keyboard.nextLine();

        System.out.print("Enter the Carrier: ");
        carrier = keyboard.nextLine();

        System.out.print("Enter Phone Number: ");
        phoneNumber = keyboard.nextLine();

        System.out.print("Enter Owners Name: ");
        owner = keyboard.nextLine();

        System.out.printf("\nSerial Number: %s\nModel: %s\nCarrier: %s\nPhone Number: %s\nOwner: %s\n\n", serialNumber, model, carrier, phoneNumber, owner);
    }

    public void info(String serialNumber, String model, String carrier, String phoneNumber, String owner) {
        System.out.printf("Serial Number 2: %s\nModel 2: %s\nCarrier 2: %s\nPhone Number 2: %s\nOwner 2: %s", serialNumber, model, carrier, phoneNumber, owner);
    }

    public String getOwner() {
        return owner;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getReceiverPhoneNumber() {
        return receiverPhoneNumber;
    }

    public void dial() {
        System.out.print("Enter Receiver's Phone Number: ");
        receiverPhoneNumber = keyboard.nextLine();
        System.out.printf("%s phone is calling %s\n", owner, receiverPhoneNumber);
    }

    public void dial(String phoneNumber){
        System.out.print("Enter Receiver's Phone Number: ");
        receiverPhoneNumber = keyboard.nextLine();
        System.out.printf("%s phone is calling from %s\n", owner, phoneNumber);
    }
}
