package ex_13_String;

import java.util.Locale;

public class Lab_060_Strings_Functions
{
    public static void main(String[] args) {

        char ch= 'A';
        System.out.println(ch);        //this is char

        String s= "A";
        System.out.println(s);          //this is String

        String s1= "ABCD";
        System.out.println(s1.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.concat(" EFGH"));

    }
}
