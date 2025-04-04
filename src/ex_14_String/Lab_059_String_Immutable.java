package ex_14_String;

public class Lab_059_String_Immutable
{
    public static void main(String[] args) {
        String s1= "Hello";
        s1= s1.concat(" Smita");
        System.out.println(s1);
        //in other way to print=
        //System.out.println(s1+ "Smita");
    }
}
