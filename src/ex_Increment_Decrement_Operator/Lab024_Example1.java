package ex_Increment_Decrement_Operator;

public class Lab024_Example1
{
    public static void main(String[] args) {
        int a=10;
        System.out.println(a++ + ++a); //22
        System.out.println(a);        //12

        //a++ = 10+1 = 11
        //++a = 11+1 = 12
        //a++ + ++a = 22
        //and a= 12
    }
}
