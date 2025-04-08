package ex_Task;

public class Task18_PersonClassWithDifferentMethods_31March
{
    //Create a Class of a Person with A - 10, B - all 4 types of methods
    // 1.Without Parameters and Without Return Type
// 2.Without Parameters but With Return Type
// 3.With Parameters and Without Return Type
// 4. With Parameters and With Return Type

    public static void main(String[] args) {
        Person p1= new Person();
        p1.personDetails();
        p1.personisMarried();
        p1.personSalary(50000);
        p1.personHeight(5.6f);
    }
}

class Person
{
    String name;
    int age;
    float height;
    double salary;
    char bloodGroup;
    boolean isMarried;

    //1.Without Parameters and Without Return Type
    void personDetails()
    {
        String name= "Smita";
        System.out.println(name);
    }

    // 2.Without Parameters but With Return Type
    boolean personisMarried()
    {
        isMarried=true;
        System.out.println("Person is married? "+ isMarried);
        return isMarried;
    }

    //3. With Parameters and Without Return Type
    void personSalary(int salary1)
    {
        System.out.println("Person salary is "+ salary);
    }

    // 4. With Parameters and With Return Type
    float personHeight(float personheight)
    {
        System.out.println("\"Person height is "+ personheight);
        return personheight;
    }



}