package org.campus02.oop;

import java.util.HashMap;

public class CountryAnalyzer extends PersonAnalyzer{

    private HashMap<String,Integer> hashMap=new HashMap<>();

    public HashMap<String, Integer> getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap<String, Integer> hashMap) {
        this.hashMap = hashMap;
    }

    @Override
    public void analyze() {
        for (Person person : super.getPersons()) {
            if (hashMap.containsKey(person.getCountry())){
                hashMap.put(person.getCountry(), hashMap.get(person.getCountry())+1);

            }
            else hashMap.put(person.getCountry(), 1);
        }
    }
}
