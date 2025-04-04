package ex_16_Arrays;

public class Lab_072_SUM_OF_ARRAYS
{
    public static void main(String[] args)
    {
        int numbers[]= {12,34,10};
        int add= 0;
        for(int i= 0 ; i< numbers.length; i++){

             add= add + numbers[i];
            System.out.println(add);
        }
        System.out.println("sum= "+add);


        int sum= 0;
        System.out.println(" For Each ---"); //Enhanced for loop
        for (int n : numbers) {
            sum = sum + n;
        }
        System.out.println(sum);
    }
}
