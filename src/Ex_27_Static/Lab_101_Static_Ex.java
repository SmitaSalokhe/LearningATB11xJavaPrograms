package Ex_27_Static;

public class Lab_101_Static_Ex
{
    public static void main(String[] args) {
            P p=new P();
    }
}

class P{
    static{
        System.out.println("This is static block");
    }

   P()
    {
        System.out.println("This is DC");
    }
    {
        System.out.println("This is Instance Initialization Block (IIB) ");
    }
}