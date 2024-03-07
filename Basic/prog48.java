// Write a program to create a list of integer numbers. Now pick all the even numbers from that list and store them in evenList. And pick all the odd numbers from that list and store them in oddList.

import java.util.Scanner;

public class prog48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] arr = new int[4];
        int [] odd = new int[4];
        int [] even = new int[4];
        for (int i =0; i<=3;i++)
        {
            arr[i]=sc.nextInt();

        }
        int j=0, k=0;
        for (int i=0; i<=3;i++)
        {
            if(arr[i]%2==0)
            {
                even[j]=arr[i];
                j++;
            }
            else{
                odd[k]=arr[i];
                k++;
            }

        }
        System.out.println("Even ");
        for (int i=0; i<j;i++)
        {
            System.out.println(even[i]);
            
        }
        System.out.println("Odd ");
        for (int i=0; i<k;i++)
        {
            System.out.println(odd[i]);
            
        }

    }
}
