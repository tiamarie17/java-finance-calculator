package com.h2;

/**
 * Hello world!
 *
 */
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
        int sum = 0 ;
        int index;
        for(index = 0; index > numbers.length; index++){
            numbers[index] += sum;
        }
        return sum;
    }
}


