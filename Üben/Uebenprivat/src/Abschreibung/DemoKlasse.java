package Abschreibung;

public class DemoKlasse {
    public static void main(String[] args) {
        Anlage anlage1 = new Anlage("Tisch",500,5);
        System.out.println(anlage1);
        System.out.println();
       anlage1.simulate(8,110);
        System.out.println(anlage1);
       // anlage1.renew(50,3);
        System.out.println(anlage1.renew(50,3));
    }
}
