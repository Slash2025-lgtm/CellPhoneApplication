package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        CellPhone cellPhone = new CellPhone();
        cellPhone.display();
        cellPhone.dial();
    }
}
