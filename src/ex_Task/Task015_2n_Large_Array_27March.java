package ex_Task;

import java.util.Arrays;

public class Task015_2n_Large_Array_27March
{
    public static void main(String[] args) {
        int numbers[]={10,80,30,48,50,66};
        int max= numbers[0];
        for(int i= 0; i<numbers.length; i ++)
        {
            if(max<numbers[i])
            {
               max= numbers[i];
            }
        }
        System.out.println("max number is = "+ max);

        System.out.println("------------------------------------------------");
        //2nd lagest number
        //way 1 with function
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);


        //way 2 without function
        int large_number=0;
        int secondLarge_number= 0;

        for(int i=0; i<numbers.length; i++)
        {
            if(numbers[i]>large_number)
            {
                secondLarge_number= large_number;
                large_number= numbers[i];
            }
            else if(numbers[i]>secondLarge_number && numbers[i]!= large_number){
                secondLarge_number=numbers[i];
            }
        }
        System.out.println("max number is "+ max);
        System.out.println("2nd large number is "+ secondLarge_number);
    }

}
