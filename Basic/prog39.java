// Write a program to accept a number from user and print it’s factorial.
import java.util.Scanner;

public class prog39 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number N : ");
        int num = sc.nextInt();
        int fact=1;
    for (int i=1;i<=num;i++)
    {
        fact=fact*i;

    }
    System.out.println("The factorial of number is : " + fact);
    sc.close();    
}
}

