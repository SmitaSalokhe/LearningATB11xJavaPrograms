package ex_21_OOPs_Encapsulation;

public class Lab_92_Ecap_Demo
{
    public static void main(String[] args)
    {
//        VWOLogin VWOLogin= new VWOLogin("admin", "psw123");
//        System.out.println(VWOLogin.username);
//        System.out.println(VWOLogin.password);
//        VWOLogin.password= "125";
//        System.out.println(VWOLogin.password);


        GoodVWOLogin GoodVWOLogin= new GoodVWOLogin("Smita", "SD@124");

        GoodVWOLogin.setUsername1("Admin");
        System.out.println(GoodVWOLogin.getUsername1());

        GoodVWOLogin.setPassword1("PSW@!1", true);
        System.out.println(GoodVWOLogin.getPassword1());

        GoodVWOLogin.setPassword1("1254", false);
        System.out.println(GoodVWOLogin.getPassword1());

    }
}

//class VWOLogin{                                        //In this class attribute are public so anyoe can access it
//    public String username;
//    public String password;
//
//    VWOLogin(String usr, String psw){    //constructor
//        this.username= usr;
//        this.password= psw;
//    }
//
//}

class GoodVWOLogin{
    public String getUsername1() {
        return username1;
    }

    public void setUsername1(String username1) {
        this.username1 = username1;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1, boolean isAdmin) {
        if(isAdmin) {
            this.password1 = password1;
        }
        else {
            System.out.println("You are not an admin so not allowed");
        }
    }

    private String username1;
    private String password1;

    GoodVWOLogin(String UName, String Psw){
        this.password1= Psw;
        this.username1= UName;
    }

}
