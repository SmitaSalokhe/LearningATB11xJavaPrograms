package ex_30_Execption;

import java.util.Scanner;

public class Lab_131_Throw
{
    public static void main(String[] args) {
        boolean canIGoToGoa= false;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter ur age");
        int age= sc.nextInt();
        try {
            validateAge(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    public static void validateAge(int age)throws Exception
    {
        if (age < 18){
            throw new Exception ("You can't go, else you will be out of the house");
        }
    }
}
