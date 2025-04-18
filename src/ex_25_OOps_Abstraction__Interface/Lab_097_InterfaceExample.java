package ex_25_OOps_Abstraction__Interface;

public class Lab_097_InterfaceExample
{
    public static void main(String[] args) {
        Square Square= new Square();
        Square.getArea(15,20);

        Rectangular Rectangular= new Rectangular();
        Rectangular.getArea(80,50);

    }
}

interface polygon{
    void getArea(int length, int breadth);
}

class Square implements polygon {

    @Override
    public void getArea(int length, int breadth) {
        System.out.println("Area of square= " + 3.14*length*breadth);
    }
}

class Rectangular implements polygon {

    @Override
    public void getArea(int length, int breadth) {
        System.out.println("Area of Rectangular = "+ ( length*breadth));
    }
}
