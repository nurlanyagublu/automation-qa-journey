package Day6;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingAndWritingToArray {

    public static void main(String args[]) {

        int a[]=new int[5];


        Scanner sc=new Scanner(System.in);
        for (int i=0;i<5;i++) {
            System.out.print("Enter number: ");
            a[i]=sc.nextInt();

        }
        System.out.print("printing array elemets.....");

        System.out.println(Arrays.toString(a));
    }

    }

