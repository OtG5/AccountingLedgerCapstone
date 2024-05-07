package com.pluralsight;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        homeScreen();
       // deposit();
//        String choice = scanner.nextLine();
//        switch (choice) {
//            case 1: deposit();
//            break;
//            case 2 :
//            case 3:
//            case 4:
//                break;
//
//
//        }


    }

//    public static void homeScreen() {
//        System.out.println("1. D) Add Deposit");
//        System.out.println("2. P) Make Payment");
//        System.out.println("3. L)Ledger");
//        System.out.println("4. E) Exit ");
//        System.out.print("Choose type number: ");
//    }

    public static double deposit(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add the amount deposited");
        System.out.println("Enter Price (ex: 12.99)");
        double d  = scanner.nextDouble();
        System.out.println("deposited: " + d);

        double[] addDeposit = new double[d];

        for (double  i = 0; i < d; i++) {
            addDeposit[i] = scanner.nextDouble();
        }

        for (double i = 0; i < d; i++) {
            System.out.println(addDeposit[i]);
        }



//
//        try {
//            FileWriter fileWriter = new FileWriter("src/main/resources/deposits.csv", true);
//
//            BufferedWriter bufWriter = new BufferedWriter(fileWriter);
//
//            FileReader fileReader = new FileReader("text.txt");
//
//            BufferedReader bufReader = new BufferedReader(fileReader);

//            double deposit  = " ";
//            doube[] lastLine;
//
//
//        } catch (IOException e) {
//            System.out.println("ERROR: An unexpected error occured");
//            e.getStackTrace();
//        }
//
//
//
//         return double;
    }
//    // need to substract data
//    public static double Payment() {
//        System.out.println("Please type payment amount");
//        System.out.println("Enter Price (ex: 12.99)");
//        double deposit  = scanner.nextDouble;
//    }
//
//    public String ledger(){
//
//    }
}
