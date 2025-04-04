package ex_Task;

import java.util.Scanner;

public class Task11_March_21_vowels
{
    public static void main(String[] args)
    {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter your character");
//        char ch= sc.next().charAt(0);
//        System.out.println(ch);

        //char a;
        for(char a = 65; a<=90; a++)
        {
            if(a==65 || a==69 || a==73 || a==79|| a== 85)
            {
                System.out.println(a+ " This is vowel");
            }
            else {
                System.out.println(a+ " This is consonants");
            }
        }


    }
}
