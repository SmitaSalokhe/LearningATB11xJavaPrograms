package ex_16_2D_Array;

public class LAb_075_2DArray_Iterate_ForLoop
{
    public static void main(String[] args)
    {
        int matrix[][]= {{1,2,3}, {4,5,6}, {7,8,9}};
        //3*3

        //1,2,3
        //4,5,6
        //7,8,9

        for(int i=0; i<matrix.length; i++)   //--this will print rows
        {
            for(int j=0; j<matrix[i].length;j++)     //--this will print columns
            {
                System.out.print(matrix[i][j]+ "  ");
            }
            System.out.println( "  ");                   //this is for space after 1 row
        }

    }
}
