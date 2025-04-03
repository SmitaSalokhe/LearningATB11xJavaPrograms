package ex_10_For_Loop;

public class Lab_040_ForLoop_EvenOdd
{
    public static void main(String[] args)
    {
        //To find even and off number in 1 to 50

        for(int i=0; i<=8;i++)
        {
            if(i%2==0)
            {
                System.out.print(i);
                System.out.println(" Even number");
            }
            else
            {
                System.out.print(i);
                System.out.println(" Odd Number");
            }
        }


        //Print only even number
        for(int l= 0; l<=50; l++)
        {
            if(l%2==0)
            {
                System.out.println(l + " is a Even number");
            }
        }

    }
}
