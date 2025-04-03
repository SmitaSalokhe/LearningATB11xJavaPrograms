package ex_13_Functions;

public class Lab_057_Simple_Method_Return_NoReturn
{
    public static void main(String[] args)
    {

        f1();
        System.out.println(INT());
        System.out.println(CHAR());
        System.out.println(return_boolean());
        System.out.println(return_float_pi_value());
        System.out.println(return_byte());
        System.out.println(return_long());
        System.out.println(return_String());

    }

    static void f1()
    {
        System.out.println("No return");
    }
    static int INT()
    {
        return 10;
    }
    static char CHAR()
    {
        return 'A';
    }
    static boolean return_boolean(){
        return true;
    }

    static float return_float_pi_value(){
        return 3.14f;
    }

    static byte return_byte(){
        return 100;
    }

    static long return_long(){
        return 10l;
    }

    static String return_String(){
        return "Pramod";
    }
}

