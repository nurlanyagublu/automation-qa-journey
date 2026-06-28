package Day18;

import java.util.Scanner;

public class ExceptionsDemo {

    public static void main(String[] args) {

        System.out.println("The program is started...");

        Scanner sc = new Scanner(System.in);

        //Example1
        /*System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(100/num);  //ArithmeticException
*/
        //Example2
        /*int a[]=new int[5];

        System.out.print("Enter 5 position(0-4): ");
        int pos=sc.nextInt();

        System.out.print("Enter the value of a["+pos+"]: ");
        int value=sc.nextInt();

        a[pos]=value;

        System.out.println(a[pos]+" "+value);

*/
        //Example3
   /*     String b="welcome";
        int num=Integer.parseInt(b); //NumberFormatException
        System.out.println(num);
*/

    //Example4

    String s=null;
    System.out.println(s.length());   //NullPointerException

        System.out.println("The program is completed...");
        System.out.println("The program is exited...");
    }
}
