package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab_135_List_I
{
    public static void main(String[] args) {

        //List fruite = new List();
        List fruite= List.of("orange","apple","banana","mango","watermelon");
        System.out.println(fruite);

        // fruits.add("chiku"); // java.lang.UnsupportedOperationException
        //        //fruits.remove("apple"); // Not possible

        List l1= new ArrayList();  //Dynamic Dispatch
        ArrayList L2= new ArrayList();

        l1.add("hello");
        l1.add(123);
        l1.add(true);
        l1.add("Blah Blah");
        System.out.println(l1);
    }
}
