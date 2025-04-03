package ex_Task;

public class Task10_March_21_FizzBuzz
{
//    Write a program that prints numbers from 1 to 100.
//    However, for multiples of 3, print "Fizz" instead of the number, and for multiples of 5, print "Buzz."
//    For numbers that are multiples of both 3 and 5, print "FizzBuzz."

    public static void main(String[] args)
    {
        for(int i =0; i<=100; i++)
        {
            if (i%3==0 && i%5==0 )
            {
                System.out.println(i + " FizzBuzz");
            }
            else if (i%5==0)
            {
                System.out.println( i+ " Buzz");
            } else if (i%3==0)
            {
                System.out.println(i+ " Fizz");

            }


        }

    }
}
