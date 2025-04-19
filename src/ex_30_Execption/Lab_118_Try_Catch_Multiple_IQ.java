package ex_30_Execption;

public class Lab_118_Try_Catch_Multiple_IQ
{
    public static void main(String[] args) {
        System.out.println("Start");
        try {
            int a = 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // Not possible as Big Exception is used before
//        } catch (ArithmeticException e){                  this one is small than Exception
//            System.out.println(e.getMessage());
//        }
            System.out.println("End");
        }
    }
}
