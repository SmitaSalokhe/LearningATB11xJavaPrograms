package ex_Task;

public class Task09_Fibonacci_Sequence

/* 0+1=1
        - 1+1=2
        - 1+2=3
        - 2+3=5
        - 3+5=8*/

{
    public static void main(String[] args)

    {
        int number= 1;
        for(int i=1; i<10;i++)
        {
           number= number * i; // for(int j=0; j<10;j++);
            System.out.println(number);
        }

    }
}
