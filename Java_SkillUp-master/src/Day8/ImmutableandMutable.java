package Day8;

import java.util.Arrays;

public class ImmutableandMutable {

    public static void main(String[] args) {

        //immutable - we cannot change
        //mutable - we can change

        //mutable
        int a[] = {20,10,40,50,30};

        System.out.println(Arrays.toString(a));
        Arrays.sort(a);  //mutable
        System.out.println(Arrays.toString(a));

        //immutable
        String s=new String("welcome");

        s.concat(" to java");

        System.out.println(s); //welcome ---> immutable - we cannot change

        //we need to assign the concated value to the other string like this:
        //String concatstring = s.concat(" to java");

        //ONLY STRINGS ARE IMMUTABLE
        //StringBuffer - mutable, can change
        StringBuffer f=new StringBuffer("welcome");
        f.append(" to java");
        System.out.println(f);
        //StringBuilder - mutable, can change

    }
}
