package ex_Task;

public class Task14_Count_vowels_March_24
{
    public static void main(String[] args)
    {

        String input = "Java Program to Count Vowels and Consonants";

        for(int i=0; i<= input.length(); i++)
        {
            char ch= input.charAt(i);
            if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                System.out.println(ch + "=  Vowel");
            }
            else {
                System.out.println(ch + "= Consonants");
            }
        }
    }
}
