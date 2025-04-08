package ex_Task;
/*/*Create a Class with the Person - where we have DC, PC , two types.
      Fields. Instances - name, age, address, phone, isMale.
      Behaviour - eat, sleep, walk, doHome, printDetails()- print the detail*/
public class Task20_DC_Constructor_with_methods
{
    public static void main(String[] args)
    {
        NewPerson n1= new NewPerson();
        n1.eat();
        n1.sleep();
    }
}

class NewPerson{
    String name;
    int age;
    String address;
    long phone;
    boolean isMale;

    NewPerson()
    {
        name= "Sejal";
    }

    void eat()
    {
        System.out.println(name+ " is eating");
    }

    void sleep()
    {
        System.out.println(name+ "is sleeping");
    }
}
