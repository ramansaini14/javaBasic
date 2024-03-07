// Write a program to accept a number and check if it is >10, <10 or =10.

import java.util.Scanner;

public class prog23 {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        if(num>10)
        {
            System.out.println("Number is greater than 10");
        }
        else 
        {
            System.out.println("Number is less than 10");
        }
        sc.close();
    }
}
