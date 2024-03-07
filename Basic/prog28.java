// Write a Program to print numbers n to 1 using Do While loop.

import java.util.Scanner;

public class prog28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number N : ");
        int n = sc.nextInt();
        do
        {
            System.out.println(n--);
        } while(n>=1);
        sc.close();
    }
}
