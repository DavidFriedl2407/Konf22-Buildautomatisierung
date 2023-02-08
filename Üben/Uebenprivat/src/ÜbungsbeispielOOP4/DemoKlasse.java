package ÜbungsbeispielOOP4;

public class DemoKlasse {
    public static void main(String[] args) {
        Zutat zutat1= new Zutat("Butter",2);
        Zutat zutat2= new Zutat("Milch",2);
        Zutat zutat3= new Zutat("Mehl",4);
        Zutat zutat4= new Zutat("Eier",6);
        System.out.println(zutat1);
        Zutat[] zutaten={zutat1,zutat2,zutat3,zutat4};
        for (int i = 1; i < zutaten.length; i++) {
            System.out.println(zutaten[i]);
        }

        System.out.println();
        Rezept rezept1= new Rezept("Kekse",4,zutaten);
        System.out.println(rezept1);
        System.out.println();
        Rezept umrechnungsrezept = rezept1.umrechnen(10);
        System.out.println(umrechnungsrezept);



    }
}
