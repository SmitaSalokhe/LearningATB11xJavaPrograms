package ex_24_OOps_Abstraction;

public class Example_3
{
    public static void main(String[] args) {
        activity activity= new activity();
        activity.show();
    }
}

abstract class Bigcar{

    abstract void show();
}

class activity extends Bigcar{

    @Override
    void show() {
        System.out.println("Start The Car");
        System.out.println("Stop The Car");
    }
}
