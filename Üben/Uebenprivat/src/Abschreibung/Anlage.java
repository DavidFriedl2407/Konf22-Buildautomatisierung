package Abschreibung;

public class Anlage {
    private String bezeichnung;
    private double initialWert;
    private int nutzungsdauer;
    private int alter;
    private double restWert;

    public Anlage(String bezeichnung, double initialWert, int nutzungsdauer) {
        this.bezeichnung = bezeichnung;
        this.initialWert = initialWert;
        this.nutzungsdauer = nutzungsdauer;
        this.restWert=initialWert;
        this.alter=0;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public double getInitialWert() {
        return initialWert;
    }

    public int getNutzungsdauer() {
        return nutzungsdauer;
    }

    public int getAlter() {
        return alter;
    }

    public double getRestWert() {
        return restWert;
    }
    public void abschreiben(){
        alter++;
            if (alter <= nutzungsdauer) {
                restWert = Math.floor(initialWert / nutzungsdauer * (nutzungsdauer - alter));
            }

    }
    public void simulate (int maxJahre, int minWert){
        for (int i = 0; i < maxJahre; i++) {
            System.out.println(restWert+" "+i+"Jahre");
            abschreiben();
            if (restWert==0||restWert<minWert){
                break;
            }


        }

    }
    public Anlage renew(int zusatzWert,int zusatzJahre){

    Anlage newanlage= new Anlage(bezeichnung,restWert+zusatzWert,nutzungsdauer-alter+zusatzJahre);
    return newanlage;
    }

    @Override
    public String toString() {
        return "Anlage{" +
                "bezeichnung='" + bezeichnung + '\'' +
                ", initialWert=" + initialWert +
                ", nutzungsdauer=" + nutzungsdauer +
                ", alter=" + alter +
                ", restWert=" + restWert +
                '}';
    }
}
