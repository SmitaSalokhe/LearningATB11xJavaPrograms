package ex_30_Execption;

public class Lab_125_Jr_QA_VS_Sr_QA_2

{
    public static void main(String[] args) {
        // QA way to handle exception
        try {
            String ip = args[0]; // java.lang.ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip); // NumberFormatException
            int b = 100 / a; // ArithmeticException
            System.out.println(b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
