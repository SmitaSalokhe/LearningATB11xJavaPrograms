package ex_19_OOps_Inheritance;

public class Lab_085_Inheritance_Father_Son_Example
{
    public static void main(String[] args)
    {
        Father f1= new Father();
        f1.home();
        System.out.println(f1.gold);

        Son s1 = new Son();
        s1.SonHome();


    }
}
class Father{
    int gold= 3000;
    void home()
    {
        System.out.println("This is father's home");
    }
}
class Son
{
    void SonHome()
    {
        System.out.println("This is my home");
    }
}
