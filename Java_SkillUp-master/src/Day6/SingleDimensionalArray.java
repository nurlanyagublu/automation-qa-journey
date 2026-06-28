package Day6;

public class SingleDimensionalArray {

    public static void main(String[] args) {

        //first approach
        int a[] = new int[5];

        a[0]=100;
        a[1]=200;
        a[2]=300;
        a[3]=400;
        a[4]=500;

        //second approach

        int b[] = {100,200,300,400,500,600};
        System.out.println(b.length);
        for (int i : b) {
            System.out.println(i);
        }

    }
}
