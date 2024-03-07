// "Write a program to accept roll number ,and marks for three subjects, print total marks and average, also print grade by considering following conditions.
// Avg>=60 Grade A
// Avg<60,Avg >=50 Grade B
// Avg<50,Avg >=40 Grade C"

import java.util.Scanner;

public class prog26 {
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
        if (average >= 60) {
            System.out.println("Grade: A");
        } else if (average >= 50) {
            System.out.println("Grade: B");
        } else if (average >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }

        sc.close();
    }
}
