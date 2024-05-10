package com.pluralsight;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("src/main/resources/deposits.csv", true);
        PrintWriter pw = new PrintWriter(fos);

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many deposits will you add? ");

        int numDeposits = scanner.nextInt();

        double[] deposits = new double[numDeposits];

        System.out.println("Enter " + numDeposits + " deposit values: ");
        for (int i = 0; i < numDeposits; i++) {
            deposits[i] = scanner.nextDouble();
        }

        // process the deposit values as needed calculate total

        // Calculate the total deposit amount
        double totalDepositAmount = 0;
        for (double deposit : deposits) {
            totalDepositAmount += deposit;
        }
        System.out.println("Total amount deposited: $" + totalDepositAmount);


        // Close the scanner
        scanner.close();

        pw.println("Number of deposits made " +numDeposits );
        pw.println("deposits made" + Arrays.toString(deposits));
        pw.println("total " + totalDepositAmount);

        pw.close();

        System.out.println("file deposits.csv has been written");



//        homeScreen();
       // deposit();




   //     Scanner scanner = new Scanner(System.in);
  //      String choice = scanner.nextLine();
//    switch (choice) {
//           case 1:d
//
//           break;
//            case 2 :
//            case 3:
//            case 4:
//                break;
//
//
 //     }


    }

//    public static void homeScreen() {
//        System.out.println("1. D) Add Deposit");
//        System.out.println("2. P) Make Payment");
//        System.out.println("3. L)Ledger");
//        System.out.println("4. E) Exit ");
//        System.out.print("Choose type number: ");
//    }




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
 //
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
