// Write a Program to print first n odd numbers.

import java.util.Scanner;

public class prog31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number N : ");
        int num = sc.nextInt();
        for(int i=1;i<=num;i+=2)
        {
            System.out.println(i);
        }
        sc.close();
    }
}
