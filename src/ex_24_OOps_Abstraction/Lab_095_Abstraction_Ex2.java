package ex_24_OOps_Abstraction;

public class Lab_095_Abstraction_Ex2
{
    public static void main(String[] args) {
        child child=new child();
        child.loan50k();
        child.loan25k();

        //Father Father= new Father(); // thi is not posible because it is a abstract class
        Father Father= new child();
        Father.loan50k();
        Father.loan25k();

    }
}

abstract class Father{

    abstract void loan50k();

    void loan25k()
    {
        System.out.println("loan25k is a normal method");
    }
}

class child extends Father{

    @Override
    void loan50k() {
        System.out.println("Child will pay the loan");
    }
}