package ex_16_Arrays;

public class Lab_067_Arrays_Creation_Part2
{
    public static void main(String[] args) {

        String name[]= {"Smita", "Manisha", "Ajit", "Shlok"};
        System.out.println(name.length);
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[3]);
        System.out.println(name[2]);

        String[] s1= new String[3];
        s1[0]= "pramod";
        s1[1] = "Amit";
        s1[2] = "Yasho";
        System.out.println(s1.length);
        System.out.println(s1[0]);

        boolean is_male_data[]= {true, false, true};
        System.out.println(is_male_data.length);
        System.out.println(is_male_data[0]);


    }
}
