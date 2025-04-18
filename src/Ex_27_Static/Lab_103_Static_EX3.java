package Ex_27_Static;

public class Lab_103_Static_EX3
{
    public static void main(String[] args) {

        STATIC.displayStatic();
        instance instance = new instance();
        instance.displayInstatnce();

        instance.sum(500, 900);
    }
}

class instance{
    int a= 10;
    int b= 20;
    void displayInstatnce()
    {
        System.out.println(a+b);
    }

    int sum(int s, int d)
    {
        int c= s+d;
        System.out.println(c);
        return c;
    }

}

class STATIC
{
    static int x= 500;
    static int z= 400;

    static void displayStatic()
    {
        System.out.println(x+z);
    }

}
