package oop;

import java.util.ArrayList;

public abstract class LongEntryAnalyzer {
   private ArrayList<LogEntry> logEntries=new ArrayList<>();

    public ArrayList<LogEntry> getLogEntries() {
        return logEntries;
    }

    public void setLogEntries(ArrayList<LogEntry> logEntries) {
        this.logEntries = logEntries;
    }
    public abstract void analyze();
}
