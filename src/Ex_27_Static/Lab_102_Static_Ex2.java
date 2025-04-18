package Ex_27_Static;

public class Lab_102_Static_Ex2
{
    public static void main(String[] args) {

        System.out.println(A.b);
        A.b=500;
        System.out.println(A.b);

        A a= new A(100);
        a.disply();
    }
}

class A{
    int a= 10;
    static int b= 20;
    void disply()
    {
        System.out.println(a);
        System.out.println(b);
    }

    A(int a)
    {
        this.a = a;
    }
}