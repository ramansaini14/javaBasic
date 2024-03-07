// Write a Program to accept a number and print the number in reverse order. E.g. if 1324 is the number then the output will be 4231.

import java.util.Scanner;

public class prog32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number N : ");
        int num = sc.nextInt();
        int reverseNum=0;
        do
        {   
            int temp=num%10;
            reverseNum=(reverseNum*10)+temp;
            num=num/10;
        }while (num!=0);
        System.out.println(reverseNum);
        sc.close();
    }
}
