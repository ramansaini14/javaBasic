// "Rohit wants to add the last digits of two given numbers. For example, If the given numbers are 267 and 154, the output should be 11. Below is the explanation -
// Last digit of the 267 is 7
// Last digit of the 154 is 4
// Sum of 7 and 4 = 11
// Write a program to help Rohit achieve this for any given two numbers.
// The prototype of the method should be - 
// where input1 and input2 denote the two numbers whose last digits are to be added.
// Note: The sign of the input numbers should be ignored. i.e.
// if the input numbers are 267 and 154, the sum of last two digits should be 11
// if the input numbers are 267 and -154, the sum of last two digits should be 11
// if the input numbers are -267 and 154, the sum of last two digits should be 11
// if the input numbers are -267 and -154, the sum of last two digits should be 11"
import java.util.Scanner;

public class prog14 {
    public static int addLastDigits(int number1, int number2)
    {
        number1 = Math.abs(number1%10);
        number2 = Math.abs(number2%10);
        return number1+number2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number 1 : ");
        int number1 = sc.nextInt();
        System.out.println("Enter the number 2 : ");
        int number2 = sc.nextInt();
        int sum = addLastDigits(number1,number2);
        System.out.println("The sum of last digits is : "+ sum);
        sc.close();
    }   
    }

