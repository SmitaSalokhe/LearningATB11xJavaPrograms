package ex_17_2D_Array;

import java.util.Scanner;

public class Lab_077_2d_Multiplication_Table
{
    public static void main(String[] args) {

        int[][]array_2D= {{1,2,3}, {4,5,6}, {7,8,9}};

        for(int i=0; i<array_2D.length; i++)
        {
            for( int j= 0; j < array_2D[i].length; j++)
            {
                int mul= i*j;
                System.out.print(mul + " ");
            }
            System.out.println(" ");
        }


        //with user input
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size");
        int n= sc.nextInt();

        for(int i=0 ; i<n; i++)
        {
            for(int j= 0; j< n; j++)
            {
                System.out.print(i*j + " ");
            }
            System.out.println(" ");
        }



    }
}
