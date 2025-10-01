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
        System.out.println("Enter Receiver's Phone Number: ");
        receiverPhoneNumber = keyboard.nextLine();
        System.out.printf("%s phone is calling %s\n", owner, receiverPhoneNumber);
    }
}
