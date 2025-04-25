package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab_147_ArrayList_Student
{
    public static void main(String[] args) {
        Student s1= new Student("Smita", "1");
        Student s2= new Student("Neha", "2");
        Student s3= new Student("Pratiksha", "3");


        List<Student> myStudents= new ArrayList<>();
        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);

        System.out.println(myStudents);

        s1.details();
        s2.details();
        s3.details();

    }
}
