// "Write a program to accept a number n from user and Add n terms of the series.
// 1/2! + 2/3! + 3/4! + 4/5! + 5/6! + ………"

import java.util.Scanner;

public class prog43 {
    public static int fact(int numb)
    {   numb+=1;
        int fact=1;
        for (int i=1;i<numb;i++)
            {fact=fact*i;}
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        for (int i=1;i<=num;i++)
        {
            System.out.println(i + "/" + fact(i+1));
        }
        sc.close();
    }
}
