public class Gehaltskonto {
    private String inhaber;
    private String iban;
    private String bic;
    private double Kontostand;

    public static int counter;
    private int fortlaufendeNummer;

    public Gehaltskonto(String inhaber, String iban, String bic){
        this.inhaber=inhaber;
        this.iban=iban;
        this.bic=bic;
        this.Kontostand=0.0;
        this.fortlaufendeNummer=counter;

    }
    public void aufbuchen(double wert){
        if (wert>0){

        Kontostand=Kontostand+wert;}
        else{
            System.out.println("Wert muss positiv sein "+wert);}

    }
    public void abbuchen(double wert){
        if (wert>0)
            if (Kontostand-wert>0)
        Kontostand=Kontostand-wert;
        else
            System.out.println("Wert muss positiv sein "+wert+"übersteigt Kontostand: "+Kontostand);

    }

    public double getKontostand() {
        return Kontostand;
    }


    public String toString() {
        return "Gehaltskonto{" +
                "inhaber='" + inhaber + '\'' +
                "counter='" + counter + '\'' +
                "fortlaufendeNummer='" + fortlaufendeNummer + '\'' +
                ", iban='" + iban + '\'' +
                ", bic='" + bic + '\'' +
                ", Kontostand=" + Kontostand +
                '}';
    }
}
