package com.Bridgelabz;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float N = sc.nextInt();
        float sum = 0,i;
        if (N != 0) {
            for ( i = 1; i <= N; i++) {
                sum = sum + (1/i);
            }
            System.out.println("Sum is:" + sum);
        }
    }
}
