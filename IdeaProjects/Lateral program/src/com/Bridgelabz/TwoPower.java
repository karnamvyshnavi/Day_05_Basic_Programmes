package com.Bridgelabz;

import java.util.Scanner;


public class TwoPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int power = 1;

        if (N < 31) {
            for (int i = 0; i <= N; i++) {
                power = power * 2;//power of 2
                System.out.println(power);//printing power of 2
                //leap year logic
                if( ((power%4 == 0) && (power%100 != 0)) || (power%400==0)){
                    System.out.println("leap year"+power);
                } else{
                    System.out.println("Not a leap year"+power);
                }
            }

        }
    }
}
