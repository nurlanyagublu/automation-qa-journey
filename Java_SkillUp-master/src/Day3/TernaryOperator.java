package Day3;

public class TernaryOperator {

    public static void main(String[] args) {

        // var = exp ? result1 : result2;

        int a=100, b=200;

        int x = (a>b)? a:b;



        int person_age=30;
        String res=(person_age>=18)? "Eligible":"Not Eligible";
        System.out.println(res);
    }
}
