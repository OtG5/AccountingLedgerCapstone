package com.pluralsight;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        homeScreen();

        String choice = scanner.nextLine();
        switch (choice) {
            case "D": deposit();
            break;
           // case L:
            //    break;
            //case X:
               // break;

        }


    }

    public static void homeScreen() {
        System.out.println("D) Add Deposit");
        System.out.println("P) Make Payment");
        System.out.println("L)Ledger");
        System.out.println("X) Exit ");
        System.out.print("Choose type letter: ");
    }

    public static void deposit(){
        System.out.println("Please add the ammount deposited");

    }
}