package Day3;

public class IncrementOperator {

    public static void main(String[] args) {

        int a=10;
        System.out.println(a);

        a++;   //a=a+1
        System.out.println(a);

        //post increment
        int b=10;
        int result=b++;
        System.out.println(result);
        System.out.println(b);

        //pre increment
        int c=10;
        int result2=++c;
        System.out.println(result2);
    }
}
