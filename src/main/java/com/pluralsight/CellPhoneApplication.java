package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        CellPhone cellPhone = new CellPhone();
        cellPhone.info();
        cellPhone.dial();
        display(cellPhone.getPhoneNumber(), cellPhone.getReceiverPhoneNumber());
    }

    public static void display(String phoneNumber, String receiverPhoneNumber) {
        System.out.printf("Phone 1: %s\n Phone 2: %s\n", phoneNumber, receiverPhoneNumber);
    }
}
