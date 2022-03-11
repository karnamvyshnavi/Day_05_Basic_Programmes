package com.Bridgelabz;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int N = sc.nextInt();
        if(N % 2 == 0)
        {
            System.out.println("Number is Even"+" "+N);
        }
        else{
            System.out.println("Number is odd"+" "+N);
        }
    }
}
