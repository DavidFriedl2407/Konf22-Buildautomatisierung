package org.campus02.oop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MaxSalaryAnalyzer extends PersonAnalyzer{

    @Override
    public void analyze() {
        HashSet<Person> personen=new HashSet<>();
        int biggestsalary=0;

        for (Person person : super.getPersons()) {
            if (person.getSalary()>biggestsalary){
                biggestsalary= person.getSalary();
                personen.clear();
                personen.add(person);
            } else if (person.getSalary()==biggestsalary) {
                personen.add(person);
            }
        }
        for (Person person : personen) {
            System.out.println(person);
        }
    }
}
