package ex_10_For_Loop;

public class Lab_043_ForLoop_Continue_EvenNo
{
    public static void main(String[] args) {
        for(int i=0; i<10; i++)
        {
            if(i%2==0)
            {
                System.out.println(i+ " Even number");
                continue;
            }
            System.out.println(i + " Odd");
        }
    }
}
