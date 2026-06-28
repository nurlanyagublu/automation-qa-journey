package Day5;

import java.util.Scanner;

public class Exercises {

    public static int reverse(int number) {
        int reversed = 0;
        int count = 0;
        int sum = 0;
        while (number != 0) {
           int digit = number % 10;
           reversed = reversed * 10 + digit;
           number =  number / 10;
           sum = sum + digit;
           count++;
        }
        System.out.println("Digit Count: " + count);
        System.out.println("Sum of the numbers " + sum);
        return reversed;
    }
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = sc.nextInt();

        System.out.println(reverse(number));

    }
}
