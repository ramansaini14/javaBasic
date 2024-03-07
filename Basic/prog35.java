// Write a program to accept a number from user and check if it is Armstrong number or not i.e. 153 = 1^3 + 5^3 + 3^3 = 153.

import java.util.Scanner;

public class prog35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is an Armstrong number: ");
        int num = sc.nextInt();

        int origNum = num;
        int n = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, n);
            num /= 10;
        }

        if (sum == origNum) {
            System.out.println(origNum + " is an Armstrong number.");
        } else {
            System.out.println(origNum + " is not an Armstrong number.");
        }

        sc.close();
    }
}
