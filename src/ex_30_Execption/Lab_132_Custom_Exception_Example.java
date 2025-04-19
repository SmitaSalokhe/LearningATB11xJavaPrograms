package ex_30_Execption;

public class Lab_132_Custom_Exception_Example
{
    public static void main(String[] args) {

        Bank sbi = new Bank("INR", 1000);
        Bank icici = new Bank("INR" , 500);
        Bank jp_chase= new Bank("USD", 100);
        int total1= sbi.add(sbi);
        System.out.println(total1);

        int total= sbi.add(icici);
        System.out.println(total);

        int USDTotal= sbi.add(jp_chase);
        System.out.println(USDTotal);




    }
}
