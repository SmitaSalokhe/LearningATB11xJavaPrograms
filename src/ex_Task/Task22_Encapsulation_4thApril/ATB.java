package ex_Task.Task22_Encapsulation_4thApril;

public class ATB
{
    public static void main(String[] args)
    {
        EmployeeAchivements EmployeeAchivements= new EmployeeAchivements();
        EmployeeAchivements.setCourse("Automation Testing is done");
        System.out.println(EmployeeAchivements.getCourse());

        EmployeeAchivements.setAwards(2);
        System.out.println(EmployeeAchivements.getAwards());

        EmployeeAchivements.setSkills("Skill- manual testing", true);
        System.out.println(EmployeeAchivements.getSkills());

        EmployeeAchivements.setAwards(50);
        System.out.println(EmployeeAchivements.getAwards());


    }
}

class EmployeeAchivements
{
    private String course;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getAwards() {
        return awards;
    }

    public void setAwards(int awards) {
        this.awards = awards;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills, boolean haveSkills) {

        if (haveSkills)
        {
            this.skills = skills;
        }
        else {
            System.out.println("Sorry ur skillsets are not matching");
        }
    }

    private int awards;
    private String skills;


}



