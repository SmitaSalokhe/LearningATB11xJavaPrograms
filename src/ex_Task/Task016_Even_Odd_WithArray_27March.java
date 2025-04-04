package ex_Task;

public class Task016_Even_Odd_WithArray_27March
{
    public static void main(String[] args)
    {
        int numbers[]= {11,80,30,47,50,69};

        for(int i=0; i<numbers.length; i++)
        {
            //System.out.println(numbers[i]);
            if(numbers[i] %2==0)
            {
                System.out.println("Even number= "+ numbers[i]);
            }
            else {
                System.out.println("Odd number= "+ numbers[i]);
            }
        }

    }
}
