package ex_20_OOPs_Polymorphism.methodoverloading;

public class Lab_089_Calculator
{
    int attribute;

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Lab_089_Calculator c1 = new Lab_089_Calculator();
        c1.add(3,4);
        c1.add(3.414,4.56);
    }
}
