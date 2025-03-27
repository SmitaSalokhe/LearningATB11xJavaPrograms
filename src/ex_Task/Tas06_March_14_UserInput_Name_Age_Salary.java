package ex_Task;

import java.util.Scanner;

public class Tas06_March_14_UserInput_Name_Age_Salary
{
    public static void main(String[] args)
    {
//        int age= Integer.parseInt(args[0]);
//        System.out.println(age);

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name");
        String name= sc.nextLine();

        System.out.println("Enter your age");
        int age= sc.nextInt();

        System.out.println("Enter your salary");
        int salary = sc.nextInt();

    }
}
