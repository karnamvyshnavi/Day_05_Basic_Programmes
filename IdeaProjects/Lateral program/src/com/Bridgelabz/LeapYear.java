package com.Bridgelabz;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number:");
        int year = sc.nextInt();
        int count = 0;

        while (year != 0) {
            int rem = year % 10;
            count += 1;
            year = year / 10;
        }
        System.out.println("count is:" + count);
        if (count == 4) {
            System.out.println("logic begins");

            if ( ((year%4 == 0 ) && (year%100 != 0)) || (year %400 == 0) ) {
                System.out.println("leap year");
            } else {
                System.out.println("Entered year is Not a leap year");
            }
        }
        else {
            System.out.println("Please enter a number with 4 digits");
        }
    }
}
