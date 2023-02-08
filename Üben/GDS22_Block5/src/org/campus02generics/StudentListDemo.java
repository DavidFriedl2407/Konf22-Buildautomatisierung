package org.campus02generics;

import java.util.ArrayList;

public class StudentListDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student maxi = new Student(1, "Max Mustermann");
        students.add(maxi);
        students.add(new Student(1, "frauMusterfrau"));
        System.out.println(students);
        students.remove(0);
        System.out.println(students);
        students.add(maxi);
        System.out.println(students);
        students.add(new Student(2, "Susi Sorglos"));
        students.add(new Student(2, "Susi Sorglos"));
        System.out.println(students);

        boolean containsSusi2 = containsName(students, "Susi Sorglos");
        System.out.println("contains Susi Sorglos " + containsSusi2);

        boolean containsMatrNr = containsMatrNr(students,2);
        System.out.println("contains Matrikelnummer2 "+containsMatrNr);
    }
            public static boolean containsName(ArrayList<Student> studentArrayList,String searchName){
                for (int i = 0; i < studentArrayList.size(); i++) {
                    Student student = studentArrayList.get(i);
                    if (student.getFullName().equals(searchName)){
                        return true;
                    }
                }return false;
    }

            public static boolean containsMatrNr (ArrayList<Student> studentArrayList,int matrNr){
                for (Student student:studentArrayList ) {
                    if (student.getMatrNr()==matrNr){
                    return true;
                }}
                return false;
            }
    }

