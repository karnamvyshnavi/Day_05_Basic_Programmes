package com.Bridgelabz;

import java.util.Scanner;

public class LargestOf3Nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if((num1 > num2) && (num1 > num2) && (num1>num2) )
        {
          System.out.println("greatest number is"+" "+num1);
        }
        else if((num2 > num1) && (num2 > num3)){
            System.out.println("greatest number is"+" "+num2);
        }else{
            System.out.println("greatest number is:"+num3);
        }


}
}
