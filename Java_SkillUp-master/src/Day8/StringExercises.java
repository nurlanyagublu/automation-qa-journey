package Day8;

public class StringExercises {

    public static void main(String[] args) {

        //reverse a string

        String s = "unknown";
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed = reversed + s.charAt(i);

        }
        System.out.println(reversed);

        //StringBuffer Class method (same for stringbuilder)
        StringBuffer a = new StringBuffer("welcome");
        System.out.println(a.reverse());

    }





}
