// Write a Program to accept user’s marital status, gender and age to check if he/she is eligible for marriage or not.

import java.util.Scanner;

public class prog27 {
    public static void main(String[] args) {
        System.out.println("Enter your marital status (Single/Married) : ");
        Scanner sc = new Scanner (System.in);
        String status = sc.nextLine();
        System.out.println("Enter Your Age : ");
        int age = sc.nextInt();
        if (status.equalsIgnoreCase("Single"))
        {
            if(age>=20)
            {
                System.out.println("You are eligible for marriage");
            }
            else {
                System.out.println("You age is not eligible for marriage");
            }
        }
        else 
        {
            System.out.println("Your marital status is 'Married' so you can not marry");
        }
       
        sc.close();
    }
}
