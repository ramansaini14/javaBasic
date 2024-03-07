// Write a program to create a list of integer numbers and print addition of all the elements of the list.


import java.util.ArrayList;
import java.util.List;

public class prog46 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        int sum = 0;
        for (int num : numbers) {
            sum = sum+num;
        }

        System.out.println("List of numbers : " + numbers);
        System.out.println("Sum of all elements : " + sum);
    }
}
