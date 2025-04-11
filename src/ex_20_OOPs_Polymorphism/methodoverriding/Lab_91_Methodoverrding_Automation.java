package ex_20_OOPs_Polymorphism.methodoverriding;

public class Lab_91_Methodoverrding_Automation
{
    public static void main(String[] args) {

        //dynamic dispatch

        commonToAll c1= new commonToAll();  //Parent class reference and Parent class object
        c1.OpenBrowser();

        chromeTC1 t1= new chromeTC1();     //chile class reference and child class object
        t1.OpenBrowser();

        commonToAll c2= new chromeTC1();   //parent class reference and child class object
        c2.OpenBrowser();

    }
}

class commonToAll{
    void OpenBrowser(){
        System.out.println("Open Browser IE");
    }
}

class chromeTC1 extends commonToAll{
    @Override
    void OpenBrowser() {
        System.out.println("Chrome");
    }

    void neww()
    {
        System.out.println("Extra");
    }
}

class Firefox extends commonToAll{
    @Override
    void OpenBrowser() {
        System.out.println("Firefox");
    }
}
