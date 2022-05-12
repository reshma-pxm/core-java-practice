package com.jumpstat;

import java.util.Scanner;

class UserInputSum {
    public static void main(String[] args) {
      
        Double number, sum = 0.0;

        // create an object of Scanner
        Scanner input = new Scanner(System.in);
      
        for (int i = 1; i < 6; ++i) {
            System.out.print("Enter a number: ");

            // takes double input from user
            number = input.nextDouble();
         
            // if number is negative the loop terminates
            if (number <= 0) {
                continue;
            }
         
           sum += number;
        }
        System.out.println("Sum = " + sum);
        input.close();
    }
}