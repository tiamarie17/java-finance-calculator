package com.h2;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
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
