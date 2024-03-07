// Write a Program to accept two numbers and a operator (+, -, *, / from user and complete that particular operation.

import java.util.Scanner;

public class prog45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2 : ");
        int num2 = sc.nextInt();
        System.out.println("Enter Operator : ");
        char ch = sc.next().charAt(0);
        int result;
        if(ch=='+')
            {result = num1 + num2;
            System.out.println("Result is " + result);}
        if(ch=='-')
            {result = num1 + num2;
            System.out.println("result is " + result);}
        if(ch=='*')
            {result = num1 + num2;
            System.out.println("result is " + result);}
        if(ch=='/')
            {result = num1 / num2;
            System.out.println("result is " + result);}
                sc.close();
        }
}
