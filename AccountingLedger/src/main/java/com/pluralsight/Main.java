package com.pluralsight;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        homeScreen();

        String choice = scanner.nextLine();
        switch (choice) {
            case 1: deposit();
            break;
            case 2 :
            case 3:
            case 4:


        }


    }

    public static void homeScreen() {
        System.out.println("1. D) Add Deposit");
        System.out.println("2. P) Make Payment");
        System.out.println("3. L)Ledger");
        System.out.println("4. E) Exit ");
        System.out.print("Choose type number: ");
    }

    public static double deposit(){
        deposit;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add the amount deposited");
        System.out.println("Enter Price (ex: 12.99)");
        double deposit  = scanner.nextDouble;

        double deposit


    }

}
