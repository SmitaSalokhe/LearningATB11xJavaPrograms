package ex_09_switch;

public class Lab_032_Char_ASCII_Interview
{
    public static void main(String[] args) {
        char ch= 'A';

        switch (ch) {
            case 68:                ;
                System.out.println("This is ASCII");
                break;
            default:
                System.out.println("No match");
        }
    }
}
