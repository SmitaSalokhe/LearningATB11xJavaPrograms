package ex_16_Arrays;

public class Lab_071_Array_Reverse
{
    public static void main(String[] args)
    {
        int numbers[]= {1,2,3,4,5};
        for(int i =4; i < numbers.length-1; i--)
        {
            int reverse= numbers[i];
            System.out.println(reverse);
        }

        //another way
        int[] numbers1 = {1, 2, 3, 4, 5};
        // 5,4,3,2,1
        for (int j = numbers1.length-1; j >=0 ; j--) {
            System.out.println(numbers1[j]);
        }
    }
}
