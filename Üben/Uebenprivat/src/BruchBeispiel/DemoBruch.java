package BruchBeispiel;

public class DemoBruch {
    public static void main(String[] args) {
        Bruch bruch = new Bruch(4,2);
        Bruch bruch1= new Bruch(6,8);
        Bruch bruch2= new Bruch(8,4);
        Bruch bruch3= new Bruch(10,2);
        System.out.println(bruch.toDecimal());
        System.out.println(bruch2.toDecimal());
        System.out.println(bruch3.toDecimal());
        System.out.println(bruch1.toDecimal());
        bruch3.print();
        bruch2.print();


        Bruch newBruch = bruch1.multiplicate(bruch2);
        newBruch.print();

        Bruch result4= newBruch.multiplicate(new Bruch(4,2));
        result4.print();
        System.out.println();
        bruch2.trim(400,100);
        System.out.println(bruch2);
        //System.out.println("Counter "+Bruch.getCounter());
        System.out.println(Bruch.getCounter());










    }
}
