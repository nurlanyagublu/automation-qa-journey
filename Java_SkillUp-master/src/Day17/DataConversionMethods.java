package Day17;

public class DataConversionMethods {

    public static void main(String[] args) {

        // String --> int

        //String s="welcome";   // can not convert to int
        String s="12345";
        int sint=Integer.parseInt(s);
        System.out.println(sint);

        String s1="10";
        String s2="20";
        System.out.println(Integer.parseInt(s1) +  Integer.parseInt(s2));


        //String --> double
        String s3="10.5";
        String s4="20.6";

        System.out.println(Double.parseDouble(s3) +  Double.parseDouble(s4));

        //String to boolean
        String s5="selenium"; // other than true, if you pass any string that will return false
        System.out.println(Boolean.parseBoolean(s5));


        //int, double, bool, char ---> String
        int a=10;
        double d=10.5;
        char c='A';
        boolean bool=true;

        String q=String.valueOf(a);
        System.out.println(q);

        q=String.valueOf(d);
        System.out.println(q);

        q=String.valueOf(c);
        System.out.println(q);

        q=String.valueOf(bool);
        System.out.println(q);


    }
}
