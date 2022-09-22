package com.basics;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortageCalculator {
    public static void main(String[] args){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = scanner.nextDouble(); // double is huge decimal, so float aybe enough here also

        System.out.print("Period (Years): ");
        int years = scanner.nextInt();

        double monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
        double poweredRate = Math.pow((1+monthlyInterestRate), (years*MONTHS_IN_YEAR));
        double result = principal * ((monthlyInterestRate * poweredRate)/(poweredRate -1));

        String mortgage = NumberFormat.getCurrencyInstance().format(result);
        System.out.println("Mortgage: " + mortgage);
    }
}
