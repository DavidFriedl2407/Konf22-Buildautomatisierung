package BeispielGehaltskonto;

public class Gehaltskonto {
    private String inhaber;
    private String iban;
    private String bic;
    private double kontostand;

    public Gehaltskonto(String inhaber, String iban, String bic) {
        this.inhaber = inhaber;
        this.iban = iban;
        this.bic = bic;
        this.kontostand = 0.0;
    }
    public void aufbuchen (double wert) {
        if (wert > 0) {
            kontostand = wert + kontostand;

        }
        else System.out.println("wert muss positiv sein");
    }
    public void abbuchen (double wert){
        if (wert>0 && kontostand>wert){
            kontostand=kontostand-wert;
        }
        else  {
            System.out.println("wert muss positiv sein");
        }


    }
    

    public double getKontostand() {
        return kontostand;
    }



    @Override
    public String toString() {
        return "Gehaltskonto{" +
                "inhaber='" + inhaber + '\'' +
                ", iban='" + iban + '\'' +
                ", bic='" + bic + '\'' +
                ", kontostand=" + kontostand +
                '}';
    }
}
