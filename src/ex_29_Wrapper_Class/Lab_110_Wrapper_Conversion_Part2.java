package ex_29_Wrapper_Class;

public class Lab_110_Wrapper_Conversion_Part2
{
    public static void main(String[] args) {
        String num= "100";
        int aa = 10;          //primitive data type


        //String to wrapper class Integer
        //Integer v= num --not allow
        Integer v = Integer.parseInt(num);
        System.out.println("Now string 100 is in wrapper form = "+ v);

        //String to primitive
        Integer v1= Integer.parseInt(num);
        System.out.println("Now string 100 is in primitive form = "+ v1);

        //primitive to String
        Integer v2= Integer.valueOf(aa);
        System.out.println("Now int aa 10 is in String form = "+ v2);

        // Primitive to String
        int age = 10;
        Integer age_wrapper = age;
        System.out.println(age_wrapper.toString());

        // Wrapper to String (toString method)

        Integer I= 100;
//        String i1= I.toString();
//        System.out.println(i1);
        System.out.println(I.toString());

    }
}
