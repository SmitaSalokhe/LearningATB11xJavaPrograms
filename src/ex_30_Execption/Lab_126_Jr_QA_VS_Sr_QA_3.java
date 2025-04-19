package ex_30_Execption;

public class Lab_126_Jr_QA_VS_Sr_QA_3
{
    public static void main(String[] args) {
        // Sr. QA way to handle exception


        try {
            String ip = args[0]; // java.lang.ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip); // NumberFormatException
            int b = 100 / a; // ArithmeticException
            System.out.println(b);
        } catch (ArithmeticException |NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
