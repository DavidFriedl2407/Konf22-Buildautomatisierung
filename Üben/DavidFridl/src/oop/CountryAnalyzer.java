package oop;

import java.util.HashMap;

public class CountryAnalyzer extends LongEntryAnalyzer{

    private HashMap<String,Integer> result=new HashMap<>();

    public HashMap<String, Integer> getResult() {
        return result;
    }

    @Override
    public void analyze() {
        for (LogEntry logEntry : getLogEntries()) {
            if (result.containsKey(logEntry.getCountryID())){


                result.put(logEntry.getCountryID(), result.get(logEntry.getCountryID())+1);
            }
            else result.put(logEntry.getCountryID(),1);
        }
    }
}
