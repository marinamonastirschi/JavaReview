package review3;

import java.util.Scanner;

public class WhileLoopScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int sum = 0;
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            sum = sum + num;

        }
        System.out.println("Sum= "+sum);
    }
}