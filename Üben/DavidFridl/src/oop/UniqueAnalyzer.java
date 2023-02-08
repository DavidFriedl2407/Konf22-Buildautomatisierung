package oop;

import java.util.ArrayList;

public class UniqueAnalyzer extends LongEntryAnalyzer{
    private ArrayList<String> result=new ArrayList<>();

    public ArrayList<String> getResult() {
        return result;
    }

    @Override
    public void analyze() {
        for (LogEntry logEntry : getLogEntries()) {
            if (!result.contains(logEntry.getMessage())){
                result.add(logEntry.getMessage());
            }
        }
    }
}
