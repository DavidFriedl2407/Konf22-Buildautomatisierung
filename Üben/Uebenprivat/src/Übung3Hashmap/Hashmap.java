package Übung3Hashmap;

import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("harry", 2);
        myMap.put("hans", 1);
        myMap.put("david", 5);

        Integer grade = myMap.get("harry");
        System.out.println(grade);
        HashMap<String, ArrayList<Integer>> gradesOfStudents = new HashMap<>();
        gradesOfStudents.put("harry", new ArrayList<>());
        gradesOfStudents.put("hans", new ArrayList<>());
        gradesOfStudents.put("david", new ArrayList<>());
        ArrayList<Integer> grades= gradesOfStudents.get("harry");
        grades.add(1);
        grades.add(1);
        grades.add(4);
        System.out.println(gradesOfStudents);
        grades=gradesOfStudents.get("hans");
        grades.add(4);




        System.out.println(gradesOfStudents.containsKey("hans"));
        System.out.println(gradesOfStudents);
      /*  for (String student :
                gradesOfStudents.keySet()) {
            List<Integer> grades = gradesOfStudents.get(student);
            System.out.print(student + "" + grades);



        }*/
    }
}
