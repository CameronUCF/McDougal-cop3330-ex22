/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Cameron McDougal
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        int num1;
        int num2;
        int num3;
        int largest;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        num2 = scanner.nextInt();

        largest = (num1 > num2) ? num1 : num2;

        System.out.println("Enter the third number:");
        num3 = scanner.nextInt();

        largest = (num3 > largest) ? num3 : largest;

        System.out.printf("The largest number is %d.", largest);
    }
}
