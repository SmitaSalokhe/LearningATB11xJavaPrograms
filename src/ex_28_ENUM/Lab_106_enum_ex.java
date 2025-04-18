package ex_28_ENUM;

public class Lab_106_enum_ex
{
    public static void main(String[] args) {

        day d1= new day();
        System.out.println(d1.weekDays[5]);

        System.out.println(DAY.SUNDAY);
        System.out.println(ProjectURL.google);
        System.out.println(ProjectURL.restassured);
    }
}

class day{
    String weekDays[]= { "Mon", "Tuse", "Wend", "Thus", "Fri", "Sat", "Sun"};
}

 enum DAY{
     SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
        }

enum ProjectURL{
    google, restassured, katalon, vwo
}
