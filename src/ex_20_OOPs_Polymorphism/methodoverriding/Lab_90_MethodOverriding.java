package ex_20_OOPs_Polymorphism.methodoverriding;

public class Lab_90_MethodOverriding
{
    public static void main(String[] args) {
        dog d1= new dog();
        d1.sound();
    }
}

class Animal{
     void sound()
     {
         System.out.println("Animal sound");
     }
}

class dog extends Animal{
    @Override

    void sound(){
        System.out.println("Bark");
    }
}
