package ex_09_switch;

import java.util.Scanner;

public class Lab_029_WeekDays_UsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day number");
        int daynum = sc.nextInt();

        switch (daynum) {
            case 1:

                System.out.println("Monday");

                break;
            case 2:

                System.out.println("Tuesday");

                break;
            case 3:

                System.out.println("Wednesday");

                break;
            case 4:

                System.out.println("Thursday");

                break;
            case 5:

                System.out.println("Friday");

                break;
            case 6:

                System.out.println("Saturday");

                break;
            case 7:

                System.out.println("Sunday");

                break;
            default:
                System.out.println("Invalide day number");
                break;

        }

    }
}
