package ex_06_Ternary_Operator;

public class Lab018_Ternary_example
{
    public static void main(String[] args)
    {
        int age =19;

        String result= age >=18 ? ("You are eligible for voting") : ("You are not eligible for voting");
        System.out.println(result);

        int num= 43;
        String Output= num%2 ==0 ?("This is positive number"): ("This is negative number");
        System.out.println(Output);

    }
}
