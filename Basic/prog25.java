// Write a program to accept three numbers from user and print them in ascending and descending order.

import java.util.Arrays;
import java.util.Scanner;

public class prog25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = sc.nextInt();
        System.out.print("Enter number 3 : ");
        int num3 = sc.nextInt();
        int[] arr = new int[]{num1,num2,num3};
        Arrays.sort(arr);
        for (int i=0;i<3;i++)
        {
            System.out.println("The ascending order of numbers are : " + arr[i]);
        }
        for (int j=arr.length-1;j>=0;j--)
        {
            System.out.println("The descending order of numbers are : " + arr[j]);
        }
        
        sc.close();
              
    }
}
