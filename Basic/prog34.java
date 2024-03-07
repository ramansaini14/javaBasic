// Write a Program to accept a number and count the number of digits in that number.

import java.util.Scanner;

public class prog34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number N : ");
        int num = sc.nextInt();
        int count=0;
        do
        {   
            count++;
            num=num/10;
            
        }while (num!=0);
        System.out.println(count);
        sc.close();
    }
}
