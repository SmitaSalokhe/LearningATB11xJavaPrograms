package ex_16_Arrays;

public class Lab_069_Arrays_Max_Min_inArray
{
    public static void main(String[] args) {
        int array[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        // Can we take the  input from user also? = Yes - later
        // Max and Min

        // Max
        int give_me_max= give_me_max(array);
        System.out.println(give_me_max);

        int give_me_min= give_me_min(array);
        System.out.println(give_me_min);


    }

    private static int give_me_min(int[] array)
    {
        int min= array[0];
        for(int i=0; i <array.length; i++)
        {
            if(array[i]< min)
            {
                min= array[i];
            }
        }
        return min;
    }

    private static int give_me_max(int[] array)
    {
        int max= array[0];
        for(int i =0; i< array.length; i++)
        {
            if(array[i] > max)
            {
                max= array[i];
            }
        }
        return max;
    }

}
