package Day6;

public class RepeatedNumberArray {

    public static void main(String[] args) {

        //find number of repeat
        int a[] = {10,20,30,40,30,40,50,30,40,10,30, 60};

        int search_element = 60;
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == search_element) {
                count++;
            }
        }
        System.out.println("There are " +count+ " repeated " +search_element+ "in the array");


    }
}
