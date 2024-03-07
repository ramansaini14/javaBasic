// Write a program to print sum of given first n numbers.

import java.util.Scanner;

public class prog38 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number N : ");
        int num = sc.nextInt();
        int sum=0;
    for (int i=1;i<=num;i++)
    {
        sum=sum+i;

    }
    System.out.println("The sum of N numbers is : " + sum);
    sc.close();    
}
}
