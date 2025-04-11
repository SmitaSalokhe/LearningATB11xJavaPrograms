package ex_16_2D_Array;

import java.util.Scanner;

public class Lab_076_2D_Right_Triangle
{
    public static void main(String[] args) {
        // How the pattern we want
        //  n = 3
        // *
        // **
        // ***

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number eg. n= 3");
        int n= sc.nextInt();

        for(int i =0; i<n; i++)                  //this is for row
        {
            for(int j = 0; j<=i; j++)                ////this is for column
            {
                System.out.print("* ");
            }
            System.out.println( " ");
        }


    }
}
