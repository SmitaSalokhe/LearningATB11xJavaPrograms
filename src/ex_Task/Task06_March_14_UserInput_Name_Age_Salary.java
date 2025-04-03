package ex_Task;

public class Task06_March_14_UserInput_Name_Age_Salary
{
    public static void main(String[] args)
    {

        System.out.println( "Enter name, age, salary");
        String name= args[0];
        System.out.println(name);

        int age= Integer.parseInt(args[1]);
        System.out.println(age);

        int salary= Integer.parseInt(args[2]);
        System.out.println(salary);


//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter your name");
//        String name= sc.nextLine();

//        System.out.println("Enter your age");
//        int age= sc.nextInt();
//
//        System.out.println("Enter your salary");
//        int salary = sc.nextInt();

    }
}
