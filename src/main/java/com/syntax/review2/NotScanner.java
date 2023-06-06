package com.syntax.review2;

import java.util.Scanner;

public class NotScanner {
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Please enter full sentence");
        String sentence= keyboard.nextLine();
        System.out.println(sentence);
        System.out.println("Please enter 1 word");
        String word= keyboard.next();
        System.out.println("Word that was captured = "+ word);
        System.out.println("Please enter integer value");
        int number= keyboard.nextInt();
        System.out.println("Entered number is = "+number);
        System.out.println("Please enter decimal value");
        double decimal= keyboard.nextDouble();
        System.out.println("Decimal value entered is = "+decimal);
    }
}
