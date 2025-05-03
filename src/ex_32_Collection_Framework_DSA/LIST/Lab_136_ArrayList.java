package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab_136_ArrayList
{
    public static void main(String[] args) {
        ArrayList arrayList= new ArrayList();
        arrayList.add("Smita");
        arrayList.add("pramod");
        arrayList.add(null);
        arrayList.add("dutta");
        arrayList.add("dutta"); // Duplicate is allowed.
        arrayList.add(123); // Different data type is allowed.

        System.out.println(arrayList);
        System.out.println(arrayList.size());

        List l2= new ArrayList();
        l2.add("Asawari");
        l2.add("Vaibhav143");

        System.out.println(l2);
        System.out.println(l2.size());
        System.out.println(l2.isEmpty());

        List l3= new ArrayList();
        System.out.println(l3);
        System.out.println(l3.isEmpty());

        ArrayList a1= new ArrayList();
        a1.add("Pranay");
        System.out.println(a1);

    }
}
