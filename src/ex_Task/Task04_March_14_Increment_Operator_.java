package ex_Task;

public class Task04_March_14_Increment_Operator_
{
    public static void main(String[] args) {

        int a= 10;
        System.out.println(++a + a++ + a++);  //11+11+12
        System.out.println(a);
    }
}
 //Description of output a
// ++a = 1+10 = 11
// a++ = 11 = 11+1 =12
// a++ = 12= 12+1 = 13

//Description of output ++a + a++ + a++
 // (++a) = 11 +
// (a++)= 11 =11+1 +   ---as its post inc
// (a++)= 12
