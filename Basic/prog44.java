// "Write a program to accept a number from user and print that number in words but in reverse order.
// E.g. 153 -> THREE FIVE ONE"

import java.util.Scanner;

public class prog44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        int rev=0,temp=0;
        do
        {
            int digit=num%10;
        
            switch (digit) {
                case 0:
                    System.out.print("ZERO ");
                    break;
                case 1:
                    System.out.print("ONE ");
                    
                    break;
                case 2:
                    System.out.print("TWO ");
                    break;
                case 3:
                    System.out.print("THREE ");
                    break;
                case 4:
                    System.out.print("FOUR ");
                    break;
                case 5:
                    System.out.print("FIVE ");
                    break;
                case 6:
                    System.out.print("SIX ");
                    break;
                case 7:
                    System.out.print("SEVEN ");
                    break;
                case 8:
                    System.out.print("EIGHT ");
                    break;
                case 9:
                    System.out.print("NINE ");
                    break;
                default:
                    System.out.print(""); 

                   
            }
            num = num/10;
        }while(num!=0);

    }
}
