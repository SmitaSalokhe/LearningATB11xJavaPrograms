package ex_Task;

import java.util.Scanner;

public class Task05_March_14_MaxNum_Ternary_Operator
{
    public static void main(String[] args) {

        //Take a user input 2 numbers from the arguments and calculate the maximum in between with ternary operator.

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers to find max number");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        String result= number1>number2 ? "1st Number is max" : "2nd Number is max";
        System.out.println(result);
    }
}
