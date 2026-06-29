package Day19;

//Upcasting - converting value from smaller to higher

// int  ---> long
// float ---> double
//DownCasting - converting value from larger to smaller
// long ---> int
// double ---> float

public class TypeCastingConcept {

    public static void main(String[] args) {

        //upcasting - automatic --- smaller to larger

       /* int intvalue=100;
        long longvalue=intvalue;
        System.out.println(longvalue);
*/
        //float f = 3.14f;
        //double doublevalue=f;

        //downcasting - manually ---> larger to smaller

        long longvalue=1000;
        int intvalue=(int)longvalue;

        double d = 124.5;
        float f = (float)d;



    }
}
