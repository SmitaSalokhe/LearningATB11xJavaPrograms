package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Lab_145_Use_Input_AL
{
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        //int age= sc.nextInt();

        ArrayList<Integer> ages= new ArrayList<>();
        ArrayList<String> names= new ArrayList<>();

        String continueInput= "Y";

        while (continueInput.equalsIgnoreCase("Y"))
        {
            System.out.println("Enter your name");
            String name= sc.next();
            names.add(name);

            System.out.println("Enter a age");
            Integer age= sc.nextInt();
            ages.add(age);

            sc.nextLine();
            System.out.println("\"Do you want to enter another record? (Y/N): \"");
            continueInput =sc.nextLine();

        }

        for(Object o:names)
        {
            System.out.println(o);
        }

        for(Integer i:ages)
        {
            System.out.println(i);
        }

        sc.close();
    }
}
