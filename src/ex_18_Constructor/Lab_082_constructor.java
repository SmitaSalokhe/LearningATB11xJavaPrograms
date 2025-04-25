package ex_18_Constructor;

public class Lab_082_constructor
{

    public static void main(String[] args) {

        automation a1= new automation();
    }
}

class automation
{
    automation(){   //this is a constructor
        System.out.println("I want to read a CSV File");
        System.out.println("Open the Page before loading the scripts");
        System.out.println("Y0u can do anything which you want to do, when Object is created.");
    }

}
