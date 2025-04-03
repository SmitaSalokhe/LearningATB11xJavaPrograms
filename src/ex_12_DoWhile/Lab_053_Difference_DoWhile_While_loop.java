package ex_12_DoWhile;

public class Lab_053_Difference_DoWhile_While_loop
{
    public static void main(String[] args)
    {
        int a=0;
//        while(a<0){
//            System.out.println(a);          //No output will appear
//            a++;
//        }

        do{
            System.out.println(a);          // this will provide an output at-least once
            a++;
        }
        while(a<0);

    }
}
