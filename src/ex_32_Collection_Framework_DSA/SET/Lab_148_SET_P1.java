package ex_32_Collection_Framework_DSA.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab_148_SET_P1
{
    public static void main(String[] args) {
        Set hs= new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add("Smita");
        hs.add("Smita");   //this will not print, duplicates are not allowed
        hs.add("Dhere");

        System.out.println(hs);
    }
}
