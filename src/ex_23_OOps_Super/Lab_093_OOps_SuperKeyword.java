package ex_23_OOps_Super;

public class Lab_093_OOps_SuperKeyword
{
    public static void main(String[] args) {

        Car car= new Car(10);
        Car car1 = new Car();
       car.display();

       // Vehicle Vehicle= new Vehicle();

    }
}

class Vehicle{
    public int maxSpeed= 180;

    Vehicle()
    {
        System.out.println("Default constructor");
    }

    Vehicle(int a)
    {
        System.out.println("Vehicle constructor- Parameterizes constructor");
    }

    void message(){
        System.out.println(" No arg, no return");
    }

    void message(int a)
    {
        System.out.println("PC- argument");
    }
    void display(){
        System.out.println("Vehicle parents");
    }
}

class Car extends Vehicle{
    private int maxSpeed = 210;

    Car()
    {
        super();
    }
    Car(int a){
    super(10);
    }

    @Override
    void display() {
        System.out.println("Override");
        System.out.println(this.maxSpeed);

        System.out.println(super.maxSpeed);
        super.message();
        super.message(50);

    }
}
