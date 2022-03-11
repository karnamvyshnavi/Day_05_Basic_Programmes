package com.Bridgelabz;

import java.util.Scanner;

public class VowelorCons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character ");
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'i' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

             System.out.println("Vowel"+" "+ch);
        }
        else{
            System.out.println("consonant"+" "+ch);
        }
    }

}
