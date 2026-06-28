package Day7;

public class StringMethods {

    public static  void main(String args[]){

        //length()
        String s = "Welcome";
        System.out.println(s.length());


        //concat() - joining strings
        String s1 = "Welcome ";
        String s2 = "to Java ";
        String s3 = "Automation";
        System.out.println(s1.concat(s2).concat(s3));

        //trim() - remove spaces right and left side
        //charAt() - returns a character from a string based on index
        s="welcome";
        System.out.println(s.charAt(3));

        //contains() - return true/false
        System.out.println(s.contains("elco"));

        //equals() , equalsIgnoreCase() - compare strings
        System.out.println(s.equals("welcome"));

        //replace() - replace single/multiple(sequence) of characters in a string
        s="welcome to selenium java selenium python selenium c#";
        System.out.println(s.replace('e', 'x'));

        //substring() - extract substring from the main string

        //split() - split the string into multiple parts based on delimeter
        String f="abc@gmail.com";

        String a[]=f.split("@");
        System.out.println(a[0]);
        System.out.println(a[1]);

        String amount="$15,20,55";

        System.out.println(amount.replace("$", "").replace(",", ""));


        //example2

        String g="abc,123@xyz";

        String b[]=g.split(",");
        String c[]=g.split("@");
        String d[]=b[1].split("@");

        System.out.println(b[0]);
        System.out.println(d[0]);
        System.out.println(c[1]);


        // * % ^ & (  )  - can not use as delimeters
    }
}
