package Day20;

import javax.swing.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        //declaration

        HashMap<Integer, String> hm=new HashMap<Integer, String>();

        //Adding pairs
        hm.put(1,"a");
        hm.put(2,"b");
        hm.put(3,"c");
        hm.put(3,"d");

        System.out.println(hm);

        System.out.println(hm.size());

        //remove pair
        hm.remove(3); //3 is key of pair
        System.out.println(hm);

        //Access value of key
        Object a = hm.get(1);
        System.out.println(a);

        //get all the keys from hashmap
        System.out.println(hm.keySet()); //only keys
        System.out.println(hm.values()); //only values
        System.out.println(hm.entrySet()); //whole set

        //Reading data from hashmap

        // for..each
        /*for (int k:hm.keySet()) {
            System.out.println(k+ "   " +hm.get(k));
        }*/

        //using iterator

        Iterator<Map.Entry<Integer, String>> it=hm.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<Integer,String> entry=it.next();
            System.out.println(entry.getKey() + "     "+entry.getValue());
        }


        hm.clear();
        System.out.println(hm.entrySet());

    }



}
