package Day8;

import java.util.Scanner;

public class Assignments {

    public static void main(String[] args) {

        //PALINDROME
       /* Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        String reverse = "";

        for(int i=s.length()-1;i>=0;i--){
            reverse=reverse+s.charAt(i);

        }
        if (s.equals(reverse)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }*/

        //Remove Junk or Special Characters in String

        /*Scanner sc=new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s=sc.nextLine();

        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("Cleaned string: " + cleaned);

        sc.close();*/

        //Remove white spaces in a string

        /*Scanner sc=new Scanner(System.in);

        System.out.print("enter a string: ");
        String str=sc.nextLine();

        String removed = str.replace(" ","");
        System.out.println("Cleaned string: " + removed);

        sc.close();*/

        //Count occurrences of a character in a String

        Scanner sc=new Scanner(System.in);

        System.out.print("enter a string: ");
        String str=sc.nextLine();

        System.out.print("enter a character to count: ");
        char ch=sc.next().charAt(0);

        int count=0;

        for (int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch) {
                count++;
            }

        }
        if (count == 0) {
            System.out.println("There is no such character in the string.");
        } else {
            System.out.println("Occurrences of '" + ch + "': " + count);
        }
    }
}
