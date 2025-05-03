package ex_32_Collection_Framework_DSA.MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab_153_Map_P1
{
    public static void main(String[] args) {
        Map m1= new HashMap();        // order will not follow as user entered
        // Map is key and value pair
        // name -> pramod

        m1.put("Name", "Smita");
        m1.put("Number", "1156080217");
        m1.put("Roll no", "55");

        System.out.println(m1);

        Map m2= new LinkedHashMap();      //same order will follow as user entered
        m2.put("Name", "Smita");
        m2.put("Number", "1156080217");
        m2.put("Roll no", "55");
        m2.put("nName","Smita");  //duplicate value are allowed
        m2.put("Name", "Vaibhav");  //Duplicate keys are not allowed

        System.out.println(m2);

        Map m3= new TreeMap();           //order by natured sort(A to Z)
        m3.put("Name", "Smita");
        m3.put("Address","Pune");
        m3.put("Number", "1156080217");
        m3.put("Roll no", "55");

        System.out.println(m3);

    }
}
