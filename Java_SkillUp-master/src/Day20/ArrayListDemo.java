package Day20;

import Day9.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

       //1. Declaration
        //Heterogenious
        ArrayList mylist = new ArrayList();

        // List mylist2 = new ArrayList<String>();

        //homogenious
        // ArrayList <Integer> mylist3 = new ArrayList<Integer>();
        //ArrayList <Employee> employeeList = new ArrayList <Employee>();

        //2. Adding data into arraylist
        mylist.add(100);
        mylist.add(10.5);
        mylist.add("Welcome");
        mylist.add('A');
        mylist.add(100);
        mylist.add(true);
        mylist.add(null);

        //size of arraylist
        int s = mylist.size();
        System.out.println(s);

        //printing arraylist
        System.out.println("Printing arraylist " + mylist);

        //remove element from arraylist
        mylist.remove(5);
        System.out.println("After removing Printing arraylist " + mylist);

        //Insert element in the arraylist
        mylist.add(2, 'N');
        System.out.println("After adding Printing arraylist " + mylist);

        //Modify element in the arraylist (modify/replace/change)
        mylist.set(2, "python");
        System.out.println("After replacing " + mylist);

        //Access specific element from arraylist
        mylist.get(2);

        //Reading all the elements from arraylist

        //using normal for loop
        /*for(int i=0;i<mylist.size();i++){
            System.out.println(mylist.get(i));
        }*/

        //using for..each loop

        /*for(Object x:mylist) {
            System.out.println(x);
        }*/

        //using iterator
        /*Iterator <Object> it = mylist.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }*/

        //checking arraylist is empty or not
        System.out.println("Is arraylist empty? "  + mylist.isEmpty());

        //Remove all the elements from the array list, no direct method - workaround
        ArrayList mylist2 = new ArrayList();
        mylist2.add(100);
        mylist2.add(10.5);
        mylist2.add("Welcome");

        mylist.removeAll(mylist2);
        System.out.println("After removing multiple elements " + mylist);

        //remove all the elements/clear
        mylist.clear();
        System.out.println("After clearing " + mylist);

    }
}
