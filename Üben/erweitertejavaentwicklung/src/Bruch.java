public class Bruch {
    private int Nenner;
    private int Zaehler;

    public Bruch (int Nenner, int Zaehler) {
        this.Nenner = Nenner;
        this.Zaehler = Zaehler;

    }


    public double toDecimal(){
        return Zaehler/(Nenner*1.0);
    }
    public void print(){
        System.out.println(Zaehler+" "+Nenner);
    }
    public int getZaehler(){
        System.out.println();

    }

}
