// Write a program to create a list of integer numbers and print maximum and minimum element from that list.

import java.util.Scanner;

public class prog47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] arr = new int[4];
        arr[0]=5;
        arr[1]=2;
        arr[2]=3;
        arr[3]=10;
        int max  = arr[0] ,min = arr[0];
        for (int i=1;i<4;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            else if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("Min is : " + min);
        System.out.println("Max is : " + max);

    }
}
