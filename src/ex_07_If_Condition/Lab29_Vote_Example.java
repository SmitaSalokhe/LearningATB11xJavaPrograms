package ex_07_If_Condition;

public class Lab29_Vote_Example
{
    public static void main(String[] args) {

        int age= 18;

        if(age>=18)
        {
            System.out.println("You are eligible");
        }
        else {
            System.out.println("You are not eligible");
        }

        int Input_age= Integer.parseInt(args[0]);
        //System.out.println("Enter your age");
        if(Input_age>=18)
        {
            System.out.println("You are eligible with you age");
        }
        else {
            System.out.println("You are not eligible with you age");
        }
    }
}
