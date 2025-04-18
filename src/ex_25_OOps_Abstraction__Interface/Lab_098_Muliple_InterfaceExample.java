package ex_25_OOps_Abstraction__Interface;

public class Lab_098_Muliple_InterfaceExample 
{
    public static void main(String[] args) {
        child child= new child();
        child.money();

            }
}

interface mother
{
    void money();
}
interface father
{
    void money();
}

class child implements mother, father{

    @Override
    public void money() {
        System.out.println("Chile money");
    }
}
