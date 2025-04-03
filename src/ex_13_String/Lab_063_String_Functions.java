package ex_13_String;

import java.util.Locale;

public class Lab_063_String_Functions
{
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));

        String name= "Sonali";
        System.out.println(name.length());
        System.out.println(name.charAt(2));

        //concat
        System.out.println("concat= " + name.concat(" Patel"));

        //contains
        System.out.println("contains= " + name.contains("a"));

        //equal
        System.out.println("equal= " + name.equals("Sonali"));
        System.out.println(" equal = "+ name.equals("Sonam"));

        //equalIgnorCase
        System.out.println("equalIgnorCase = "+ name.equalsIgnoreCase("SONALI"));

        System.out.println("lowercase = " +name.toLowerCase());
        System.out.println("Upper case= "+ name.toUpperCase());

        //Substring
        System.out.println("Substring "+ name.substring(1, 3));  //meaning it will print the index char from 1 to 2, 3 will not consider

        //Index of
        System.out.println("Index of a = "+ name.indexOf('a'));
        System.out.println("Index of x = "+ name.indexOf('x'));  //if nothing is there it will print -1

        //replace
        System.out.println("replace = "+ name.replace('i','I'));

        //split
        String mail= "smita@gmail@.com";
        String split[]= mail.split("@");
        System.out.println("split ="+  split[0]);
        System.out.println(" split="+ split[1]);
        System.out.println(" split="+ split[2]);

        //end with and start with
        System.out.println("start with = "+ name.startsWith("s"));
        System.out.println("end with = " + name.endsWith("i"));

        String Trim= "    Smita     ";
        System.out.println("After trim= "+Trim.trim());

        System.out.println("Compare to = "+name.compareTo("Smita"));
        System.out.println("Compare to = "+name.compareTo("Smita"));


    }
}
