package ex_30_Execption;

public class Lab_114_String_NullPointer
{
    public static void main(String[] args) {
        String name= null;
        name.trim();          // java.lang.NullPointerException
    }
}
