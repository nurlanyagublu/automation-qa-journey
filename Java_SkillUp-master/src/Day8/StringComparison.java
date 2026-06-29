package Day8;

public class StringComparison {

    public static void main(String[] args) {

        //Case1
        String s1="welcome";
        String s2="welcome";

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        //Case2
        String a1=new String("welcome");
        String a2=new String("welcome");

        System.out.println(a1==a2);  //false
        System.out.println(a1.equals(a2));  //true

        //Case3

        String b1 = "abc";
        String b2 = new String("abc");
        System.out.println(b1==b2);  //false
        System.out.println(b1.equals(b2));   //true

        //Case4

        String c1="abc";
        String c2=new String("abc");
        String c3=c2;

        System.out.println(c1==c2);  //false
        System.out.println(c1.equals(c2));  //true
        System.out.println(c2==c3); //true
        System.out.println(c2.equals(c3)); //true


    }
}

// == is for comparing the objects
// .equals() is for comparing the values of objects

// when we use "new", then new object is created