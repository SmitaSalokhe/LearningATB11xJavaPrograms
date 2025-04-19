package ex_30_Execption;

public class Lab_122_Try_Catch_Finally
{
    public static void main(String[] args) {
        int a =1;
        int c = 0;
        try {
            c = 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("I will be always executed!");  //Finally block will alway run even if u correct ur exception like 10/2
        }
    }
}
