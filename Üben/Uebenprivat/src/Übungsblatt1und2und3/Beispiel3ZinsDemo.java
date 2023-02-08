package Übungsblatt1und2und3;

public class Beispiel3ZinsDemo {
    public static void main(String[] args) {




        System.out.println(eigeneMethode(1000,2.25));
        System.out.println(eigeneMethode(400,3));
        System.out.println(eigeneMethode(800,4.5));


    }
    public static double eigeneMethode (int kontostand, double zinsen){
        double erhalteneZinsen=kontostand*(zinsen/100);
        return erhalteneZinsen;
    }
}
