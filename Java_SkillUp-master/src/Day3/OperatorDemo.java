package Day3;

public class OperatorDemo {

    public static void main() {

        int a=10, b=20;
        System.out.println(a>b); //false

        boolean b1=10>20;
        System.out.println(b1);

        boolean b2=20>10;
        System.out.println(b2);

        System.out.println(b1 && b2); //false
        System.out.println(b1 || b2); //true
    }
}
