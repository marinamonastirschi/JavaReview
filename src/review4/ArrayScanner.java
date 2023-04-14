package review4;

import java.util.Scanner;

public class ArrayScanner {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("how many integers");
        int size=input.nextInt();
        int [] numbers=new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("please enter "+(i+1)+" element");
            numbers[i]= input.nextInt();
            //add a sum variable / add all values then divide by size

        }

    }
}
