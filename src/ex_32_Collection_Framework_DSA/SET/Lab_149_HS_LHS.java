package ex_32_Collection_Framework_DSA.SET;

import java.util.*;

public class Lab_149_HS_LHS
{
    public static void main(String[] args) {
        Set<String> hs= new HashSet();
        // Hashing mechanism to store the element
        // no order.
        // no duplicates

        hs.add("Apple");
        hs.add("Orange");
        hs.add("WaterMelon");
        hs.add("WaterMelon");     //duplicate
        // hs.add(123);         this is not string so not allow
        hs.add(null);
        hs.add(null);                  //duplicate

        System.out.println(hs);

        for(String s:hs)
        {
            System.out.println(s);
        }

        // Iterator
        Iterator iterator = hs.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("------------------------------------------------------------------------------");

        Set<String> lhs= new LinkedHashSet();

        // LinkedList mechanism to store the element,
        // order will maintain, no duplicates

        lhs.add("Dpple");
        lhs.add("apple");
        lhs.add("Orange");
        lhs.add("WaterMelon");
        lhs.add("WaterMelon");
        lhs.add(null);
        System.out.println(lhs);

        System.out.println("------------------------------------------------------------------------------");

        Set<String> ts= new TreeSet();

        // Black and Red Tree mechanism to store the element.
        // order will maintain, Natural(A to Z) Sorting is done.
        // Natural Sorting - ASCII values.
        ts.add("Dapple");
        ts.add("Apple");
        ts.add("apple");
        ts.add("Orange");
        ts.add("WaterMelon");
        ts.add("apple");
        //ts.add(123);     // java.lang.ClassCastException
       // ts.add(null);      // java.lang.NullPointerException

        System.out.println(ts);

        //for each
        for(String a: ts)
        {
            System.out.println(a);
        }
    }
}
