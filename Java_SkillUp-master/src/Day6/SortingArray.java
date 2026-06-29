package Day6;

import java.util.Arrays;

public class SortingArray {

    public static void main(String[] args) {

        int a[] = {100, 600, 200, 500, 500};

        System.out.println("Before sorting....");
        for (int i : a) {
            System.out.println(i);
        }
        Arrays.sort(a);
        System.out.println("After sorting....");
        for (int i : a) {
            System.out.println(i);
            
        }
    }
}
