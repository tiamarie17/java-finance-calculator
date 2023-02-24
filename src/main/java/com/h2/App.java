package com.h2;

import java.util.Scanner;
import com.h2.BestLoanRates;
import com.h2.SavingsCalculator;
import com.h2.MortgageCalculator;
import com.h2.Utilities;

public class App
{
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a service: Enter 'bestLoanRates', 'savingsCalculator', or 'mortgageCalculator'.");
        String[] service = new String[]{scanner.nextLine()};
        if (service[0].equals( "bestLoanRates")) {
            System.out.println("Enter your loan term in years");
            int loanTermInYears = scanner.nextInt();
            float result = BestLoanRates.getRates(loanTermInYears);
            System.out.println("Your rate is " + result);

//        }else if (service[0] == "savingsCalculator") {
//            SavingsCalculator.main();
//        }else if (service[0] == "mortgageCalculator") {
//            MortgageCalculator.main();
//        }
//        else {
//            System.out.println("Did not receive a valid service. Exiting program.");
//        }
            scanner.close();
        }
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
