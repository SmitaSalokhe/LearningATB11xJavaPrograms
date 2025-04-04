package ex_Task;

public class Task14_Count_vowels_By_Pramod_March_24
{
    public static void main(String[] args) {
        String input = "Java Program to Count Vowels and Consonants";
        int vowels = 0;
        int consonants = 0;

        input = input.toLowerCase();
        System.out.println(input);

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonants++;
            }


        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);


    }
}
