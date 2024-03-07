// Write a Program to accept a number and print sum of it’s digits.

import java.util.Scanner;

public class prog33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number N : ");
        int num = sc.nextInt();
        int sum=0;
        do
        {   
            int temp = num%10;
            num=num/10;
            sum = sum + temp;
            
        }while (num!=0);
        System.out.println(sum);
        sc.close();
    }
}
