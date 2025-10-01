package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Do you want to me CellPhone 1 or 2? (Type 1 or 2): ");
        int Selected = keyboard.nextInt();

        if (Selected == 1) {
            CellPhone cellPhone = new CellPhone();
            cellPhone.info();
            cellPhone.dial();
            display(cellPhone.getPhoneNumber(), cellPhone.getReceiverPhoneNumber());
        } else {
            System.out.println("\n\nCellPhoneApp [Open]");
            System.out.print("Enter Serial Number: ");
            String serialNumber = keyboard.next();

            System.out.print("Enter the Model: ");
            String model = keyboard.nextLine();

            System.out.print("Enter the Carrier: ");
            String carrier = keyboard.nextLine();

            System.out.print("Enter Phone Number: ");
            String phoneNumber = keyboard.nextLine();

            System.out.print("Enter Owners Name: ");
            String owner = keyboard.nextLine();

            CellPhone cellPhone = new CellPhone(serialNumber, model, carrier, phoneNumber, owner);
            cellPhone.info(serialNumber, model, carrier, phoneNumber, owner);
            cellPhone.dial(phoneNumber);
        }



    }

    public static void display(String phoneNumber, String receiverPhoneNumber) {
        System.out.printf("Phone 1: %s\nPhone 2: %s\n", phoneNumber, receiverPhoneNumber);
    }
}
