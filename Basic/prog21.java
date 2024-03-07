// Write a program to accept two number and print largest among them.

import java.util.Scanner;

public class prog21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1=sc.nextInt();
        System.out.print("Enter number 2 : ");
        int num2=sc.nextInt();
        if(num1>num2)
        {
            System.out.println("Number 1 is Greater");
        }
        else if(num1<num2)
        {
            System.out.println("Number 2 is Greater");
        }
        else if (num1==num2)
        {
            System.out.println("Numbers are equal");
        }
        else 
        {
            System.out.println("Invalid Input");
        }
        sc.close();
        
    }
}
