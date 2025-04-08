package ex_18_OOPS;

public class Lab_079_Class_Object
{
    static class Person
    {
        // Attribute | Properties |  Data Members | Instance variables
        String name;
        String phone;
        String colour_eye;
        int legs;
        double salary;
        byte age;
        double weight;
        boolean isMale;

        // Behaviour | Function | Method

        void sleep()
        {
            System.out.println("I am sleeping");
        }

        void talk()
        {
            System.out.println("Talking");
        }

        String name(String name)
        {
            return "Hello"+name;
        }
    }
    public static void main(String args[])
    {
        Person p1= new Person();
        //p1= referance
        // new Person() = object
        //person= class

        p1.name= "lucky";
        System.out.println(p1.name);

        new Person().name= "No ref name";
    }
}

