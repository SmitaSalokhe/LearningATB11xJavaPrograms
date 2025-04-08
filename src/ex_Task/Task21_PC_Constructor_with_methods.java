package ex_Task;

public class Task21_PC_Constructor_with_methods
{
    public static void main(String[] args)
    {
        NewPCPerson pc= new NewPCPerson("Smita ", 28, "Pune ", "25465454 " ,false);
        pc.eat();
        pc.sleep();
        pc.PersonDetails();
    }
}

class NewPCPerson{
    String name;
    int age;
    String address;
    String phone;
    boolean isMale;

    NewPCPerson(String nameARG,int ageARG, String addressARG, String phoneARG, boolean isMaleARG)
    {
        this.name= nameARG;
        this.age= ageARG;
        this.address= addressARG;
        this.phone= phoneARG;
        this.isMale= isMaleARG;
    }

    void eat()
    {
        System.out.println(this.name + " is eating");
    }

    void sleep()
    {
        System.out.println(this.name + " is eating");
    }
    void PersonDetails()
    {
        System.out.println(this.name+ this.age+ this.isMale+ this.phone);
    }
}
