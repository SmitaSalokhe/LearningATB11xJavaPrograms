package ex_Task;

import java.sql.SQLOutput;
import java.util.Scanner;


//Write a program that classifies a triangle based on its side lengths.
// Given three input values representing the lengths of the sides,
// determine if the triangle is equilateral (all sides are equal),
// isosceles (exactly two sides are equal), or
// scalene (no sides are equal). Use an if-else statement to classify the triangle.
public class Task08_March_14_Triangle_Class_HR
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter yout 1st lenght");
        int T1= sc.nextInt();

        System.out.println("Enter yout 2nd lenght");
        int T2= sc.nextInt();

        System.out.println("Enter yout 3rd lenght");
        int T3= sc.nextInt();

        if (T1==T2 && T2==T3 )
        {
            System.out.println("Your triangle is equilateral");
        }
        else if (T1==T2 || T2==T3 || T1==T3)
        {
            System.out.println("Your triangle is isosceles");
        }
        else
        {
            System.out.println("Your triangle is scalene");
        }

    }
}
