// Write a Program to print numbers 1 to n using while loop.

import java.util.Scanner;

public class prog29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number N : ");
        int num = sc.nextInt();
        int n=1;
        while(n<=num)
        {
            System.out.println(n++);
        }
        sc.close();
        
    }
}
