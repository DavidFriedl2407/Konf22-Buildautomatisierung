package Beispiel3;

public class Osterhase extends Hase{
    public Osterhase(String name) {
        super(name);
    }

    @Override
    public void verteilen() {

        System.out.println(name+"versteckt Geschenke und Ostereier");
    }
}
