package ex_19_OOps_Inheritance;

public class Lab_087_hierarchical
{
    public static void main(String[] args) {

        AjitFather f1= new AjitFather();
        f1.Home();

        Smita s1= new Smita();
        s1.S_Home();
        s1.Home();

        Nikhil n1= new Nikhil();
        n1.N_Home();
        n1.Home();

    }
}

class AjitFather{

    void Home(){
        System.out.println("Father's Home");
    }
}

class Smita extends AjitFather{

    void S_Home(){
        System.out.println("Smita's Home");
    }
}

class Nikhil extends AjitFather{

    void N_Home(){
        System.out.println("Nikhil's Home");
    }
}