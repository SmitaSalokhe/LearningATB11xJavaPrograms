package ex_17_2D_Array;

public class Lab_074_2DArray_declaration
{
    public static void main(String[] args)
    {
        //1,2,3
         //4,5,6
         //7,8,9

        // way 1 to declare a 2d array
        int[][]array_2D= {{1,2,3}, {4,5,6}, {7,8,9}};

        // way 2 to declare a 2d array
        int array[][]= new int[3][3];
        array[0][1]= 1;
        array[0][2]= 2;
        array[0][3]= 3;

        array[1][0]= 4;
        array[1][1]= 5;
        array[1][2]= 6;

        array[2][0]= 7;
        array[2][1]= 8;
        array[2][3]= 9;




    }
}
