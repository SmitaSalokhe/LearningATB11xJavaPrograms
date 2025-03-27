package ex_Task;

import java.util.Scanner;

// Take user input & Check weather the input is even or odd number

public class Task06_March_14_EvenOdd_IfElse
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number");
        int number= sc.nextInt();

        if(number%2==0)
        {
            System.out.println("Your number is even");
        }
        else {
            System.out.println("Your number is odd");
        }
    }
}
