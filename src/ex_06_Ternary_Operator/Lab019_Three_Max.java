package ex_06_Ternary_Operator;

public class Lab019_Three_Max
{
    //Write a Java program that takes two numbers as input and determines the largest using nested if statements.

    public static void main(String[] args)
    {

        //Write a Java program that takes two numbers as input and determines the largest using nested if statements.


        int a=730, b=200, c=500;
        String largest= a>b ?(a >c ? "A is large number" : "C is large number") : (b>c ?"B is large number" : "C is large number");
        System.out.println(largest);

    }
}
