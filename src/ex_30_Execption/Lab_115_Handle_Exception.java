package ex_30_Execption;

public class Lab_115_Handle_Exception
{
    public static void main(String[] args) {
        int a = 0;
//
//        System.out.println(10/0);  java.lang.ArithmeticException




        try {
            try {
                a = 10/0;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(a);


        // Checked - JVM
        // JVM knows about it , During Compilation - JVM is saying that
        // there can be case when this file is not found.
        //

        // JVM knows that this may lead to file not found exception
        // so it telling to handle it.
    }
}
