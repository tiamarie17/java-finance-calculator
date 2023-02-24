package com.h2;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a service: Enter 'bestLoanRates', 'savingsCalculator', or 'mortgageCalculator'.");
        String[] service = new String[]{scanner.nextLine()};

        switch (service[0]) {
            case "bestLoanRates":
                System.out.println("Enter your loan term in years");
                int loanTermInYears = scanner.nextInt();
                float result = BestLoanRates.getRates(loanTermInYears);
                System.out.println("Your rate is " + result);
                break;
            case "savingsCalculator":
                System.out.println("Enter your total savings amount:");
                float credit = scanner.nextFloat();
                System.out.println("Enter your total expenses:");
                float debit = scanner.nextFloat();
                float netSavings = credit - debit;
                System.out.println("Your net savings is $" + netSavings);
                break;
            case "mortgageCalculator":
                System.out.println("Enter your loan amount: ");
                long loanAmount = scanner.nextLong();

                System.out.println("Enter your term in years:");
                int termInYears = scanner.nextInt();

                System.out.println("Enter your annual rate:");
                float annualRate = scanner.nextFloat();

                MortgageCalculator calculator = new MortgageCalculator(loanAmount, termInYears, annualRate);
                calculator.calculateMonthlyPayment();
                System.out.println(calculator.toString());
                break;
            default:
                System.out.println("Did not receive a valid service. Exiting program.");
        }
        scanner.close();
    }


    public static int doubleTheNumber(int number) {
        return (number * 2) ;
    }

    private static int add(int[] numbers) {
        int sum = 0;
        for(int index = 0; index < numbers.length; index ++){
            sum += numbers[index];
        }
        return sum;
    }
}

/*
Alternative for loop:
int sum = 0;
for (int number: numbers){
sum += number;
}*/
