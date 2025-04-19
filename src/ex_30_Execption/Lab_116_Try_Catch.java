package ex_30_Execption;

public class Lab_116_Try_Catch
{
    public static void main(String[] args) {
        int b= 10;
        int c;

        try{
            c= b/0;      // --the line where u r getting exception
        }
        catch (Exception e){          //Exception is a class and 'e' is reference variable
            System.out.println(e.getMessage());   //here u can print any meaning message
            System.out.println("Are you fool to divided by zero??");
        }
    }
}
