package ex_09_switch;

import java.util.Scanner;

public class Lab_031_Real_Switch_Automation
{
    public static void main(String[] args) {

        // Web Automation
        // I will ask the user to give me the input from browser which he wants to
        // use to I will start the automation in that browser.

        String browser= args[0];
        System.out.println("browser");

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your browser name");
//        String browser = sc.next();

        switch (browser)
        {
            case "Chrome":
                System.out.println("Starting the chrome");
                break;

            case "FireFox":
                System.out.println("Starting the FireFox");
                break;

            case "Edge":
                System.out.println("Starting the Edge");
                break;
        }

    }
}
