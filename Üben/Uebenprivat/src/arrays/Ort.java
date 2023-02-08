package arrays;

import java.util.ArrayList;

public class Ort {

    private String namen;
    private ArrayList<Ort> Nachbarn=new ArrayList<>();;

    public Ort(String namen) {
        this.namen = namen;


    }

    public void addNachbar (Ort o){
        Nachbarn.add(o);
    }


    public String getNamen() {
        return namen;
    }

    public void setNamen(String namen) {
        this.namen = namen;
    }

    public ArrayList<Ort> getNachbarn() {
        return Nachbarn;
    }

    public void setNachbarn(ArrayList<Ort> nachbarn) {
        Nachbarn = nachbarn;
    }

    @Override
    public String toString() {
        return "Ort{" +
                "namen='" + namen + '\'' ;
    }
}
