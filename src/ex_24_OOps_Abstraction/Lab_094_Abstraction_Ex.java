package ex_24_OOps_Abstraction;

public class Lab_094_Abstraction_Ex
{
    public static void main(String[] args) {

        Wagenor Wagenor= new Wagenor();
        Wagenor.drive();
    }
}

abstract class Engine{
    abstract void startEngine();
    abstract void stopEngine();

}

class Wagenor extends Engine {
    @Override
    void startEngine() {
        System.out.println("Engine started");
    }

    @Override
    void stopEngine() {
        System.out.println("Engie stoped");
    }

    void drive()
    {
        startEngine();
        stopEngine();
    }
}
