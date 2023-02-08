package Beispiel3;

public class Demoanwendung {
    public static void main(String[] args) {
        Hase hase = new Hase("normaler Feldhase ");

        hase.fressen();
        hase.verteilen();
        Weihnachtshase a= new Weihnachtshase("hans ");
        a.fressen();
        a.verteilen();
        a.hoppeln();
        Osterhase b= new Osterhase("michi ");
        b.fressen();
        b.hoppeln();
        b.verteilen();
        System.out.println("-----------------------");
        Hasenstall hoppelWiese=new Hasenstall();
        hoppelWiese.add(hase);
        hoppelWiese.add(a);
        hoppelWiese.add(b);
        System.out.println("verteilen von Hoppelwiese");
        hoppelWiese.verteilen();
        hoppelWiese.fuettern();



    }
}
