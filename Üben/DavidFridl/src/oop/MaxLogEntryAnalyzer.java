package oop;

import oop.LogEntry;
import oop.LongEntryAnalyzer;

public class MaxLogEntryAnalyzer extends LongEntryAnalyzer {

    private Integer logEntry= new LogEntry().getLogEntryID();

    public void analyze(){
        Integer integer=0;

        for (LogEntry entry : getLogEntries()) {
            if (entry.getLogEntryID()>integer){
                integer=entry.getLogEntryID();
            }
        }
        logEntry=integer;
    }




}
