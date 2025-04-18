package ex_27_Static;

public class Lab_103_Static_REAl_Ex
{
    public static void main(String[] args)
    {

        ATB.DoAssignments();
        ATB A1= new ATB();

        A1.setName("Smita");
        A1.setPhoneNum("584154");

        System.out.println(A1.getName());
        System.out.println(A1.getPhoneNum());

    }
}
class ATB{

    {
        System.out.println("IIB- this is called when object is created");
    }

    static{
        System.out.println("When class load- I will get called");
    }

    private String name;

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String phoneNum ;
    static String course;
    static String mentorName;


    static void DoAssignments(){
        System.out.println("Do Assignments");
    }

    void HowToDo()
    {
        System.out.println("How to DO");
    }
}
