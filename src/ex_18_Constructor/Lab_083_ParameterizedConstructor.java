package ex_18_Constructor;

public class Lab_083_ParameterizedConstructor
{
    public static void main(String[] args)
    {

        //this for printing default constructor
         car1 c1= new car1();
         car1 c2= new car1();
         car1 c3= new car1();

        car1 c4= new car1("BMW ", "Version 1 ", 2025);
        System.out.println(c4.CarName+ c4.Mode+ c4.year);

        car1 c5= new car1 ("Audi ", "TopMode ", 2025);
        System.out.println(c5.CarName+ c5.Mode+ c5.year);

    }
}

class car1{

    String CarName;
    String Mode;
    int year;

    //This is default constructor
      car1()
    {
        CarName= "FZ ";
        Mode = "Version 3 ";
        year = 2023;
        System.out.println( CarName + Mode + year );
    }

    car1(String CarName,String Mode, int year )
    {
        this.CarName= CarName;
        this.Mode = Mode;
        this.year= year;

        System.out.println(CarName+ Mode+ year);
    }
}




