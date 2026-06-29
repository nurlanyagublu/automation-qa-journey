package Day18;

import java.util.Scanner;

public class HandleExceptions {

    public static void main(String[] args) {

        System.out.println("The program is started...");

        Scanner sc = new Scanner(System.in);

        //Example1
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        try {
            System.out.println(100 / num);  //ArithmeticException
        }
        catch (ArithmeticException e) {
            System.out.println("Invalid data entered!!!");
        }
        System.out.println("The program is completed...");
        System.out.println("The program is exited...");
    }
}
