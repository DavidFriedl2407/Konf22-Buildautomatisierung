package ÜbungsbeispielOOP4;

import java.util.Arrays;

public class Rezept {
    private String name;
    private int personen;
    private Zutat[] zutaten;

    public Rezept(String name, int personen, Zutat[] zutaten) {
        this.name = name;
        this.personen = personen;
        this.zutaten = zutaten;
    }

    public String getName() {
        return name;
    }

    public int getPersonen() {
        return personen;
    }

    public Zutat[] getZutaten() {

        return zutaten;
    }

    @Override
    public String toString() {
        return "Rezept{" +
                "name='" + name + '\'' +
                ", personen=" + personen +
                ", zutaten=" + Arrays.toString(zutaten) +
                '}';
    }
    public void printRezept(){
        System.out.println(name+": "+zutaten);

    }
    public Rezept umrechnen(int personen){
        double faktor= personen/(getPersonen()*1.0);
        Zutat[] neueZutaten= new Zutat[zutaten.length];
        for (int i = 0; i < zutaten.length; i++) {
         neueZutaten[i]= new Zutat(zutaten[i].getName(),(int) (zutaten[i].getMenge()*faktor));


        }


        Rezept neuesRezept=new Rezept(name,personen,neueZutaten);
        return neuesRezept;
    }
}
