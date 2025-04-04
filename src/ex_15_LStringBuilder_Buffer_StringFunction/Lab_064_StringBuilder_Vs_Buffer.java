package ex_15_LStringBuilder_Buffer_StringFunction;

public class Lab_064_StringBuilder_Vs_Buffer
{
    public static void main(String[] args) {

        String s1= "Smita";
        String s2= new String("Vaibhav");

        StringBuffer stringBuffer = new StringBuffer("Rohit");
        StringBuilder stringBuilder = new StringBuilder("Shraddha");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
    }
}
