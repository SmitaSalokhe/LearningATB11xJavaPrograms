package ex_03_Literals;

public class Lab013_char_literals
{
    public static void main(String[] args) {
        char c1 = 'A'; // A to Z, a-z, !@#$%^&*()_+

        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("This is a First line" + new_line + "This is a Second line");
        System.out.println("Smita"+tab_line+"Salokhe");
        System.out.println("Smita"+back_space+"Salokhe");
        System.out.println("Smita is old"+carriage_return+"Salokhe");

        //another way to print next line
        System.out.println("This is a First line \n This is a Second line\n this is third line  ");


    }

}
