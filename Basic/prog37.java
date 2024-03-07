// Write a program to print table of a given number n.

import java.util.Scanner;

public class prog37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number N : ");
        int n = sc.nextInt();
        for (int i=1; i<11;i++)
        {
            System.out.println(n + " X " + i + " is " + i*n);
        }
        sc.close();
    }
}
