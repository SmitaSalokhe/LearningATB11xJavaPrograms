package ex_19_Constructor;

public class Lab_083_DefaultConstructor
{
    public static void main(String[] args)
    {

        DefaultCons d1= new DefaultCons();

    }
}

class DefaultCons
{
    DefaultCons(){
        System.out.println("This is default constructor and it is automatically calling while creating of an object");

        String Ename= "Pranav ";
        int age= 22;
        System.out.println(Ename+age);
    }
}
