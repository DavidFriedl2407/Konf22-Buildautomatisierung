package Übungs2Hashset;

import Übung1Arraylist.Student;

import java.util.*;

public class StudentSetDemo {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student(7, "stefan"));
        Student student1 = new Student(1, "hans");
        Student student2 = new Student(2, "bernd");
        Student student3 = new Student(1, "lisa");
        Student student4 = new Student(1, "hans");
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.remove(student2);
        System.out.println(students);
        System.out.println(students.contains(student4));
        System.out.println(students.contains(new Student(3, "lisa")));
        for (Student n :
                students) {
            System.out.println(n);
        }

        System.out.println(student1.equals(student3));




    }
}
