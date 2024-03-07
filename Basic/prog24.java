// Write A Program To Accept A Number From User And Print If It Is Even Or Odd.

import java.util.Scanner;

public class prog24 {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        if(num%2==0)
        {
            System.out.println("Number is even");
        }
        else 
        {
            System.out.println("Number is odd");
        }
        sc.close();
    }
}
