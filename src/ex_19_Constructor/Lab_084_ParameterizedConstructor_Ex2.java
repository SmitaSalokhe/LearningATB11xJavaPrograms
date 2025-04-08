package ex_19_Constructor;

public class Lab_084_ParameterizedConstructor_Ex2
{
    public static void main(String[] args) {
        Employee e1= new Employee();

        PDEmployee e2= new PDEmployee("Smita ", 27);
        System.out.println(e2.name+ e2.age);

        PDEmployee e3= new PDEmployee("Asawari ", 25);
        System.out.println(e3.name+ e3.age);

    }

}

class Employee
{
    Employee()
    {

    }
}

class PDEmployee
{
    String name;
    int age;
    PDEmployee(String Ename, int EAge)
    {
        this.name= Ename;
        this.age= EAge;
    }

}
