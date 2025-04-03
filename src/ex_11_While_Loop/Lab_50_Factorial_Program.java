package ex_11_While_Loop;

import java.util.Scanner;

public class Lab_50_Factorial_Program
{

    /*The **factorial** of a number n, denoted as **n!**, is the product of all positive integers from **1 to n**.

### Formula:
 n!=n×(n−1)×(n−2)×...×2×1

### Examples:
- 5!=5×4×3×2×1=120
- 4!=4×3×2×1=24
- 3!=3×2×1=6
### Special Cases:
- 1!=1
- 0!=1 (by definition)
 */


    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");

        int number= sc.nextInt();  //4

        int factorial= 1;
        for(int i=1;i<=number;i++)  //1 2 4
        {
            factorial= factorial*i;
        }
        System.out.println(factorial);


    }
}
