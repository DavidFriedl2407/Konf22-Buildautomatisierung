package Übung1Arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentListDemo {
    public static void main(String[] args) {

       // List <Student> students = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"susi sorglos"));
        students.add(new Student(2,"bernd brot"));
        students.add(new Student(3,"lisa marie"));
        students.add(new Student(4,"hans knaus"));

        students.remove(3);
        for (Student student : students) {
            System.out.println(student);
        }
        Student student1= new Student(5,"hans maier");
        students.add(student1);
        System.out.println(students.contains(student1));
        Student student2= new Student(5,"hans maier");
        students.add(student2);
        System.out.println(students.contains(student2));
        System.out.println("............");

        System.out.println(students.contains(new Student(1,"susi sorglos")));

        }


}
