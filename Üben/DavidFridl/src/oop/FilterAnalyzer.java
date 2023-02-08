package oop;

import java.util.ArrayList;

public class FilterAnalyzer extends LongEntryAnalyzer{

    private ArrayList<LogEntry> result=new ArrayList<>();
    private String logLevel;

    public FilterAnalyzer(String logLevel) {
        this.logLevel = logLevel;
    }

    @Override
    public void analyze() {
        if (getLogLevel().equals(logLevel)) {
            result.add(getLogLevel());
        }
    }

    public ArrayList<LogEntry> getResult() {
        return result;
    }

    public String getLogLevel() {
        return logLevel;
    }
}
