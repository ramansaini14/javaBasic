// Write a program to accept a number and print if the number is Positive/Negative.

import java.util.Scanner;

public class prog22 {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        if(num>0)
        {
            System.out.println("Number is Positive");
        }
        else if(num<0)
        {
            System.out.println("Number is Negative");
        }
        else 
        {
            System.out.println("Number is Zero");
        }
        sc.close();
    }
}
