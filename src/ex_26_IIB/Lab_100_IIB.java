package ex_26_IIB;

public class Lab_100_IIB
{
    public static void main(String[] args) {

        A a= new A();
    }
}
// ```
//IIB
//Instance initialization Block == IIB
//I will be executed when Object is created.
//`

class A{

    A()
    {
        System.out.println("Default constructor");
    }

    {
        System.out.println("IIB 1");
        System.out.println("If you want to execute or call something when object is created");
    }
    {
        System.out.println("IIB 2");
    }
}