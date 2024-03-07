// Write a program to accept a number and print prime numbers between 2 and n.
import java.util.Scanner;
public class prog41 {
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
    }
    }
