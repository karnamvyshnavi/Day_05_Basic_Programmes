package com.Bridgelabz;

import java.util.Scanner;

public class Swap2num {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number a");
        int a=sc.nextInt();
        System.out.println("Enter b number b");
        int b=sc.nextInt();
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("a is"+" "+a);
        System.out.println("b is"+" "+b);
    }
}
