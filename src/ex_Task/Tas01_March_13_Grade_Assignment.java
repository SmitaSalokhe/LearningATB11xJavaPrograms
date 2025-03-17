package ex_Task;

import java.util.Scanner;

public class Tas01_March_13_Grade_Assignment {
    public static void main(String[] args) {
        /*Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
        A: 90-100
        B: 80-89
        C: 70-79
        D: 60-69
        F: 0-59*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = sc.nextInt();

        String result = (marks < 0 || marks > 100) ? "Enter a valide marks" :
                (marks > 0 && marks <= 59) ? "F" :
                (marks >= 60 && marks <= 69) ? "D" :
                (marks >= 70 && marks <= 79) ? "C" :
                (marks > +80 && marks <= 89) ? "B" :
                (marks >= 90 && marks <= 100) ? "A" :
                "F";
        System.out.println(result);

    }
}
