package Day19;

//A b = (C) d;

public class TypeCastingObjects3 {

    public static void main(String[] args) {
         // EX1
        //Object o = new String("Welcome");
        //StringBuffer sb=(StringBuffer)o;  //Rule1 passed, R2 passed, R3 failed

        //EX2
        //String s=new String("Welcome");
        //StringBuffer sb=(StringBuffer) s; //Rule1 failed

        //EX3
        //Object o=new String("Welcome");
        //StringBuffer sb= (String) o; //Rule 2 failed

        //EX4
        //String s=new String("Welcome");
        //StringBuffer sb =(String) s; //Rule 2 failed

        //EX5
        Object o = new String ("Welcome");
        String s =(String) o; //all passed
        System.out.println(s);
    }
}
