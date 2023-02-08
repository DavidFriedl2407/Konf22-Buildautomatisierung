package ÜbungsbeispieleOOP;

public class Beispiel1Rezeptverwaltung {

    private String name;
    private int menge;

    public Beispiel1Rezeptverwaltung(String name, int menge) {
        this.name = name;
        this.menge = menge;
    }

    public String getName() {
        return name;
    }

    public int getMenge() {
        return menge;
    }

    @Override
    public String toString() {
        return "Beispiel1Rezeptverwaltung{" +
                "name='" + name + '\'' +
                ", menge=" + menge +
                '}';
    }
}

