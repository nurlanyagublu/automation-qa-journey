package Day6;

public class SearchElementArray {

    public static void main(String[] args) {

        int a[] = {10, 20, 30, 40, 50, 30, 30};
        int search_element = 300;

        boolean status = false;
        //check if 30 is in the array list

        for (int i = 0; i < a.length; i++) {
            if (a[i] == search_element) {
                System.out.println("Element found");
                status = true;
                break;
            }

        }
        if (status == false) {
            System.out.println("Element not found");
        }
    }
}