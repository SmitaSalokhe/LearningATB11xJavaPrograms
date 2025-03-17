package ex_06_Ternary_Operator;

public class Lab020_Real_Age_Classification
{
    public static void main(String[] args)
    {
        //Adult  ( age > 18) , Minor (age  <18), Senior ( age > 65)

        int age= 10;

        String result= age < 18 ? "Minor": (age <65 ? "Adult" :"Senior");
        System.out.println(result);


    }
}
