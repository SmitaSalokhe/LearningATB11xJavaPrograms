package ex_15_LStringBuilder_Buffer_StringFunction;

public class Lab_065_StringBuffer
{
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Pramod");
        s1.append("Dutta");
        System.out.println(s1);

        System.out.println(s1.reverse());

        String s2= "Hello";
        String s3= "World";
        String s4= s2+s3;

        System.out.println(s4);
        System.out.println(s2);

    }
}
