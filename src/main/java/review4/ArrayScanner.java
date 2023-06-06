package review4;

import java.util.Scanner;

public class ArrayScanner {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("how many integers");
        int size=input.nextInt();
        int [] numbers=new int[size];
        int sum=0;
        for (int i = 0; i < size; i++) {
            System.out.println("please enter "+(i+1)+" element");
            numbers[i]= input.nextInt();
            sum++;
            //add a sum variable / add all values then divide by size


        }
        System.out.println(sum);
        System.out.println(sum/size);

    }
}
