package ex_23_OOps_Super;


public class Lab_093_OOps_SuperKeyword_Ex
{
    public static void main(String[] args) {
        Dog dog= new Dog();
        dog.display();
    }

}

class Animal{

    protected String color= "White";

    void sound()
    {
        System.out.println("Animal sound! ");
    }
}

class Dog extends Animal{
    private String color = "Black";

    void display(){
        System.out.println(this.color);
        System.out.println(super.color);
        super.sound();
    }

}