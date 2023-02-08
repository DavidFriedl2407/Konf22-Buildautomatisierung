package ÜbungsbeispieleOOP2;

import java.util.Arrays;

public class Rezept {
    private String name;
    private int person;
    private Zutat[] zutaten;

    public Rezept(String name, int person, Zutat[] zutaten) {
        this.name = name;
        this.person = person;
        this.zutaten = zutaten;

        }



    public String getName() {
        return name;
    }

    public int getPerson() {
        return person;
    }

    public Zutat[] zutaten() {
        return zutaten;
    }
    public void printRezept(){
        System.out.println(this.name+": ");
        for (int i = 0; i < this.zutaten.length; i++) {
            System.out.println(this.zutaten[i]);

        }
    }
    public Rezept umrechnen (int person){
        double faktor= person/(getPerson()*1.0);
        Zutat[] neueZutaten= new Zutat[this.zutaten.length];
        for (int i = 0; i < this.zutaten.length; i++) {
            neueZutaten[i]= new Zutat(this.zutaten[i].getName(), (int) (this.zutaten[i].getMenge()*faktor));


        }
        Rezept neu = new Rezept(this.name,person,neueZutaten);
        return neu;
    }

    @Override
    public String toString() {
        return "Rezept{" +
                "name='" + name + '\'' +
                ", person=" + person +
                ", zutaten=" + Arrays.toString(zutaten) +
                '}';
    }
}
