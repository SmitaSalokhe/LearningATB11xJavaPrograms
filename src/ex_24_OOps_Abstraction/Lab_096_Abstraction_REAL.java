package ex_24_OOps_Abstraction;

public class Lab_096_Abstraction_REAL
{
    public static void main(String[] args) {
        c1 c1= new c1();
        c1.computePay();

    }
}

abstract class Employee {

    private String name;
    private String adress;
    private String number;

    Employee()
    {

    }
    Employee(String name, String adress, String number)
    {
        System.out.println("Constructing an employee");
        this.name= name;
        this.adress = adress;
        this.number= number;
    }

    abstract double computePay();

    void details()
    {
        System.out.println(this.name+ " " + this.number+" " +  this.adress);
    }
}

class c1 extends Employee{


    @Override
    double computePay() {
        return 0;
    }
}