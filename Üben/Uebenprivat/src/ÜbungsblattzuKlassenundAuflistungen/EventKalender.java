package ÜbungsblattzuKlassenundAuflistungen;

import java.util.ArrayList;

public class EventKalender {
   private ArrayList<Event> events;

    public EventKalender() {
        this.events = new ArrayList<>();

    }
    public void add(Event newEvents){
        events.add(newEvents);
    }
    public void print(){

        for (Event e :
                events) {
            System.out.println(e);



        }
    }
    public Event getByTitle(String title){
        for (Event e :
                events) {
            if (e.getTitel().equals(title)) {
                return e;
            }

            }

        return null;

    }
    public ArrayList<Event> getByOrt (String ort){
        ArrayList<Event> neuesevent=new ArrayList<>();
        for (Event e :
                events) {
            if (e.getOrt().equals(ort)){

            neuesevent.add(e);

            }

        }
        return neuesevent;

    }
    public ArrayList<Event> getByEintrittsPreis (double min, double max){
        ArrayList<Event> result=new ArrayList<>();
        for (Event e :
                events) {
            if (e.getEintrittspreis()>=min && e.getEintrittspreis()<=max){
                result.add(e);
            }

        }

        return result;
    }
    public Event getMostExpensiveByOrt(String ort){
        ArrayList<Event> result= getByOrt(ort);
        double maxPrice=-1;


        for (Event e :
                result) {
            if (e.getEintrittspreis()>maxPrice) {
                maxPrice=e.getEintrittspreis();

            }

            }
        for (Event e :
                result) {
            if (e.getEintrittspreis() == maxPrice) {
                return e;
            }
            }

        return null;
    }
    public double getAvgPreisByOrt (String ort){
        ArrayList<Event> result= getByOrt(ort);
        double durchschnittskosten=0;
        int counter=0;
        for (Event e :
                result) {
            durchschnittskosten=durchschnittskosten+e.getEintrittspreis();
            counter++;


        }
        double result1=durchschnittskosten/counter;


        return result1;
    }



}
