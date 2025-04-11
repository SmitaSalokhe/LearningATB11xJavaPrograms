package ex_19_OOps_Inheritance;

public class Lab_086_multilevel_inheritance
{
    public static void main(String[] args) {

        //MyGrandfather_property g1= new MyGrandfather_property();


        MyGrandfather g1= new MyGrandfather();
        g1.MyGrandfather_property();
        System.out.println("------------------");

        MyFather f2= new MyFather();
        f2.MyFather_property();
        f2.MyGrandfather_property();
        System.out.println("----------------");

        ItsMe me1= new ItsMe();
        me1.MyProperty();
        me1.MyFather_property();
        me1.MyGrandfather_property();
    }
}
