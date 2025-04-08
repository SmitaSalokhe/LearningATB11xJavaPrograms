package ex_OOPS;

public class Lab_080_Class_cat
{
    public static void main(String[] args)
    {

        cat c1= new cat();
        c1.running();

    }
}

    class cat{
        String catName;

        void running()
        {
            System.out.println("Cat is rinning");
        }
    }

