package BruchBeispiel;

public class Bruch {
    private int nenner;
    private int zaehler;
    private static int counter=0;

    public Bruch(int nenner, int zaehler) {
        this.nenner = nenner;
        this.zaehler = zaehler;
        counter++;
    }


    public int getNenner() {

        return nenner;
    }

    public int getZaehler() {

        return zaehler;
    }


    public static int getCounter() {
        return counter;
    }

    public double toDecimal(){
        double Bruch=zaehler/(nenner*1.0);
        return Bruch;

    }
    public void print(){

        System.out.println(zaehler+"/"+nenner);
    }
    public Bruch multiplicate(Bruch b2){
        int newNenner = nenner* b2.nenner;
        int newZaehler = zaehler* b2.zaehler;
        Bruch result = new Bruch(newNenner,newZaehler);
        return result;

    }
    public  Bruch multiplicate(Bruch b2,Bruch b3){
        return multiplicate(b2).multiplicate(b3);

    }
    public void printcounter(){
        System.out.println("counter"+counter);
    }

    @Override
    public String toString() {
        return "Bruch{" +
                "nenner=" + nenner +
                ", zaehler=" + zaehler +
                '}';
    }
    public void trim(int z,int n){
        int d=2;
        int zaeh=z;
        int nenn=n;
        for (int i = n; i > d; d++) {
            if (zaeh%d == 0 && nenn%d == 0){
            zaeh=zaeh/d;
            nenn=nenn/d;
            d--;

            }
        }


    }
}
