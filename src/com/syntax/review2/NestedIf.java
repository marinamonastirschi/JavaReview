package com.syntax.review2;

public class NestedIf {
    public static void main(String[] args) {
        boolean dl = true;
        boolean car = true;
        if (dl) {
            System.out.println("Let's check if you have a car");
            if (car) {
                System.out.println("You can drive");
            } else {
                System.out.println("You will need to take a bus");
            }
        } else {
            System.out.println("You should get a DL");
        }
    }
}