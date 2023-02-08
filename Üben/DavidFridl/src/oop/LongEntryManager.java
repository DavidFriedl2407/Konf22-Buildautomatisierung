package oop;

import java.util.ArrayList;

public class LongEntryManager {

   private ArrayList<LogEntry> logEntries=new ArrayList<>();

    public ArrayList<LogEntry> getLogEntries() {
        return logEntries;
    }
    public void add(LogEntry p){
        logEntries.add(p);
    }
}
