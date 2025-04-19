package ex_30_Execption;

public class Lab_120_IQ_1
{
    public static void main(String[] args) {

        System.out.println("Starting the programm");

        try {
            String input_user= args[0];        // java.lang.ArrayIndexOutOfBoundsExceptio
            int a = Integer.parseInt(input_user); // java.lang.NumberFormatException: For input string
            int output = 100/a;
        } catch (ArrayIndexOutOfBoundsException |ArithmeticException| NumberFormatException e)   //here e is a object and it is created by JVM
        {
            System.out.println(e.getMessage());
        }


    }
}
