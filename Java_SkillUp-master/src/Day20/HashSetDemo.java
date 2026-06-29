package Day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {

        //Declaration

        HashSet myset = new HashSet();
        //Set myset = new HashSet();

        //HashSet <String> myhash = new HashSet<String>();

        //adding elements in to hashset
        myset.add(100);
        myset.add(100);
        myset.add(10.5);
        myset.add("welcome");
        myset.add(null);
        myset.add(null);
        myset.add('A');

        System.out.println(myset);

        //size

        System.out.println(myset.size());

        //remove element
        myset.remove('A');

        //inserting element - not possible

        //Access specific element - not possible

        //WORKAROUND - convert hashset --> arraylist
        /*ArrayList a1 = new ArrayList(myset);
        System.out.println(a1.get(2));*/

        //Read all the elements using for..each
        /*for (Object o : a1) {
            System.out.println(o);
        }*/

        //using iterator

        Iterator it=myset.iterator();

        while(it.hasNext()){
        System.out.println(it.next());
        }

        //clear all the elements
        myset.clear();
        System.out.println(myset.isEmpty());
        System.out.println(myset);
    }
}
