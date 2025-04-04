package ex_16_Arrays;

public class Lab_066_ArraysExample
{
    public static void main(String[] args) {

        // different ways to declare a array

        //way 1-
        int [] marks = {51, 91,52,47,20};
        System.out.println(marks.length);
        System.out.println(marks[0]);
       // System.out.println(marks[5]);
        //System.out.println(marks[-1]);   //ArrayIndexOutOfBoundsException
        //System.out.println(marks[10]); // .ArrayIndexOutOfBoundsException

        //way 2-
        int Stud_Count[]= {1,2,2,3,};
        System.out.println("Stud_Count "+Stud_Count[0]);

        //way 3-
        int numbers[]= new int[5];   //5 is a length od array
        int [] no= new int[7];
        String [] names= new String[5];
        names[0]= "Smita";
        names[1]= "Nikhil";
        names[2]= "Asawari";
        System.out.println("names "+ names[0]);

    }
}
