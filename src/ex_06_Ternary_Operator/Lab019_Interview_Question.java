package ex_06_Ternary_Operator;

public class Lab019_Interview_Question
{
    public static void main(String[] args) {

        //nested if else using ? :

        int num= 10;
        String result= num >100 ? ("large number") : ("Small number");         //Simple if else

        //nested if else
         int number= 100340;
        String output= number>2000 ? (number>10000 ? "Largest number": "Small number") : "Large number";
        System.out.println(output);



        //Print max number
        int x= 10, y=20;
        System.out.println(Math.max(x,y));    //simple way using Math method
        //Using if else
        String max = x>y ? ("X is max number") : ("Y is max number");
        System.out.println(max);
    }
}
