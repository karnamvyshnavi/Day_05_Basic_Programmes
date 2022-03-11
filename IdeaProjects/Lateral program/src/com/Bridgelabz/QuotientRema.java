package com.Bridgelabz;

import java.util.Scanner;

public class QuotientRema {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int N= sc.nextInt();
            int rem = (N % 10);
            int quotient = N / 10;

            System.out.println("Remainder :" + rem);
            System.out.println("Quotient :" + quotient);
    }
}
