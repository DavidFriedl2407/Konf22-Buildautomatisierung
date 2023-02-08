package Bestellverwaltung;

import java.util.Arrays;

public class Bestellung {
    private String nummer;
    private Bestellzeile[] bestellzeilen;

    public Bestellung(String nummer, Bestellzeile[] bestellzeilen) {
        this.nummer = nummer;
        this.bestellzeilen = bestellzeilen;
    }

    public String getNummer() {
        return nummer;
    }

    public Bestellzeile[] getBestellzeilen() {
        return bestellzeilen;
    }

    public void printBestellung(){
        for (int i = 0; i < bestellzeilen.length; i++) {
            System.out.println(bestellzeilen[i]);

        }
    }

    @Override
    public String toString() {
        return "Bestellung{" +
                "nummer='" + nummer + '\'' +
                ", bestellzeilen=" + Arrays.toString(bestellzeilen) +
                '}';
    }
    public double getKosten() {

        double gesamtkosten = 0;
        for (int i = 0; i < bestellzeilen.length; i++) {
            gesamtkosten += bestellzeilen[i].getKosten();
        }
        return gesamtkosten;
    }
}
