// Write a Program to check whether a number is perfect  number or not. A Perfect Number is a special type of positive number. When the number is equal to the sum of its positive divisors excluding the number, it is called a Perfect Number. For example, 28 is the perfect number because when we sum the divisors of 28, it will result in the same number. The divisors of 28 are 1, 2, 4, 7, and 14.

import java.util.Scanner;

public class prog36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a Perfect Number: ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i=1;i<= num/2;i++) {
            if (num%i==0) {
                sum += i;
            }
        }
        if (sum == num) {
            System.out.println(num + " is a Perfect Number.");
        } else {
            System.out.println(num + " is not a Perfect Number.");
        }
        sc.close();
    }
}
