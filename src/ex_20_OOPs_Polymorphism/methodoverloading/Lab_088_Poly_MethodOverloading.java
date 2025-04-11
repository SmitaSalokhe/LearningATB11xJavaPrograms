package ex_20_OOPs_Polymorphism.methodoverloading;

public class Lab_088_Poly_MethodOverloading
{

    Maths m1= new Maths();
    int r1=  m1.add(5,6);
    int r2= m1.add(5,2,7);
    int r3= m1.add(50,80);


}

class Maths{

    // In the same class, When you have a method wit same
    // name but different arguments and different return type.

    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c)
    {
        return a+b+c;
    }

    double add(double a, double b)
    {
        return a+b;
    }

}