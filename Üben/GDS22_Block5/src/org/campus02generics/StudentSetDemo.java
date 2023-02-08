package org.campus02generics;

import java.util.HashSet;

public class StudentSetDemo {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student(5,"Hans Wurst"));
        students.add(new Student(6,"Heli Wurst"));
        students.add(new Student(7,"Erika Wurst"));
        students.add(new Student(5,"Hans Wurst"));
        System.out.println(students);
        students.remove(new Student(5,"Hans Wurst"));
        System.out.println(students);



    }
}
