// Write a program to accept a number and print fibonacci series upto that level.

import java.util.Scanner;

public class prog42 {
    public static void main(String[] args) {
        int first=0, second=1, next,i;
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        System.out.print(first + " " + second + " ");
        for (i=2;i<num;i++)
        {
        next=first+second;
        first=second;
        second=next;
        System.out.print(" " + next + " ");
        }
        sc.close();
    }
}
