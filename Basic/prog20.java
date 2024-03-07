// Write a program to accept roll no and marks of 3 subjects of a student, Calculate total of 3 subjects and average.

import java.util.Scanner;

public class prog20 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter roll number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter marks for 3 subjects : ");
        int marks [] = new int[3];
        int total=0;
        for (int i=0;i<3;i++)
        {
            marks[i] = sc.nextInt();
            total=total + marks[i];
        }
        System.out.println("The roll number of student is : " + num1);
        System.out.println("Total Marks is : " + total);
        float average = (float) total / 3;
        System.out.println("The average of 3 subjects is : " + average);
        sc.close();
    }
}

    