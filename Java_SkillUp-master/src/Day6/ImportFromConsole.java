package Day6;

import java.util.Scanner;

public class ImportFromConsole {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        /*System.out.print("Enter a number: ");
        double n=sc.nextDouble();

        System.out.print(n); */

        System.out.print("Enter your name: ");

        String name=sc.nextLine();

        System.out.println(name);
    }
}
