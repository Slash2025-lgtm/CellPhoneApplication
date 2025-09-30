package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter Serial Number: ");
        String serialNumber = keyboard.nextLine();

        System.out.println("Enter the Model: ");
        String model = keyboard.nextLine();

        System.out.println("Enter the Carrier: ");
        String carrier = keyboard.nextLine();

        System.out.println("Enter Phone Number");
        String phoneNumber = keyboard.nextLine();

        System.out.println("Enter Owners Name");
        String owner = keyboard.nextLine();

        CellPhone cellPhone = new CellPhone(serialNumber, model, carrier, phoneNumber, owner);

        cellPhone.display(serialNumber, model, carrier, phoneNumber, owner);
    }
}
