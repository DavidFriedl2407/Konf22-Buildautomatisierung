package ÜbungsblattzuKlassenundAuflistungen;

import java.util.ArrayList;

public class WasserstandManager {

    private ArrayList<Wasserstand> wasserstaende=new ArrayList<>();

    public void add (Wasserstand w){

        wasserstaende.add(w);

    }
    
    public Wasserstand findById(int id){

        for (Wasserstand wasserstand : wasserstaende) {
            if (wasserstand.getId()==id){
                return wasserstand;
            }
        }

        return null;
    }

    public ArrayList<Wasserstand> findAllByGewaesser(String gewaesserName){
            ArrayList<Wasserstand> gefundenewasserstaende=new ArrayList<>();
        for (Wasserstand wasserstand : wasserstaende) {
            if (wasserstand.getGewaesserName().equals(gewaesserName)){
                gefundenewasserstaende.add(wasserstand);

            }


        }
        return gefundenewasserstaende;
    }
    public Wasserstand findLastWasserstand(String gewaesserName){
        int sekunden =0;
        Wasserstand newest=null;
        for (Wasserstand wasserstand : wasserstaende) {
           if (wasserstand.getGewaesserName().equals(gewaesserName)){
               if (wasserstand.getZeitpunkt()>sekunden){
                   newest=wasserstand;
                   sekunden=wasserstand.getZeitpunkt();
               }
           }
        }
        return newest;
    }
    public ArrayList<Wasserstand> findForAlarmierung(){
        ArrayList<Wasserstand> wasserstand=new ArrayList<>();

        for (Wasserstand wasserstand1 : wasserstaende) {
            if (wasserstand1.getMessWert()>=wasserstand1.getMessWertFuerAlamierung()){
                wasserstand.add(wasserstand1);
            }
        }
        return wasserstand;
    }

    public double calcMittlererWasserstand(String gewaesserName){
        double wasserstand=0;
        double counter=0;
        for (Wasserstand wasserstand1 : wasserstaende) {
            wasserstand=wasserstand+wasserstand1.getMessWert();
            counter++;
        }



        return wasserstand/counter;
    }
    public ArrayList<Wasserstand> findByZeitpunkt(int von, int bis, String
            gewaesserName){
        ArrayList<Wasserstand> wasserstand=new ArrayList<>();
        for (Wasserstand wasserstand1 : wasserstaende) {
            if (wasserstand1.getGewaesserName().equals(gewaesserName)){
                if (wasserstand1.getZeitpunkt()<=bis&&wasserstand1.getZeitpunkt()>=von){
                    wasserstand.add(wasserstand1);
                }
            }
        }

        return wasserstand;

    }





}
