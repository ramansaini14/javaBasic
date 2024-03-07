// Write a program to accept a number from user and print if it is prime or not.
import java.util.Scanner;

public class prog40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number to know it is prime or not ");
        int num=sc.nextInt();
        int i=2;
        while(i<=num/2)
        {
            if(num%i==0)
            {
                System.out.println("Number is not prime");
                return;
            }            
        
       
            i++;
        }
       
            System.out.println("Number is prime");
     sc.close();       
    }
    }

