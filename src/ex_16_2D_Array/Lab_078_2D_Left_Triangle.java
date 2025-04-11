package ex_16_2D_Array;

import java.util.Scanner;

public class Lab_078_2D_Left_Triangle
{
    public static void main(String[] args) {

        //***
        //**
        //*

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size");
        int n= sc.nextInt();

        for(int i=n; i>0; i--)
        {
            for(int j= 0; j<i; j++)
            {
                System.out.print("*");
            }
                System.out.println(" ");
        }
    }
}
