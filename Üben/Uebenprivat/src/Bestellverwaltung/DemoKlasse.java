package Bestellverwaltung;

public class DemoKlasse {
    public static void main(String[] args) {
        Bestellzeile bestellzeile1= new Bestellzeile("Tisch",2,200);
        Bestellzeile bestellzeile2= new Bestellzeile("Sessel",4,500);
        Bestellzeile bestellzeile3=new Bestellzeile("Kasten",1,100);
        Bestellzeile bestellzeile4= new Bestellzeile("Couch",1,800);

        Bestellzeile[] bestellung1={bestellzeile1,bestellzeile2,bestellzeile3,bestellzeile4};
        Bestellung bestellungneu= new Bestellung("111",bestellung1);
        System.out.println(bestellungneu);
        System.out.println();
        bestellungneu.printBestellung();
        System.out.println();
        System.out.println(bestellungneu.getKosten());




}}
