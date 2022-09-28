public class ZinsDemo {
    public static void main(String[] args) {
        double kontostand;
        double zinsen;
        kontostand=1000;
        zinsen=2.25/100;
        double erhalteneZinse;
        erhalteneZinse=zinsen*kontostand;
        System.out.println("erhalte Zinsen "+erhalteneZinse);
        System.out.println(zinsrechnung(110,2.5)+"€");
        System.out.println(zinsrechnung(2000,2)+"€");
        System.out.println(zinsrechnung(3200,2.75)+"€");
        System.out.println(zinsrechnung(4800,3.25)+"€");






    }
    public static double zinsrechnung (double kontostand, double zinsen){
        double result = kontostand*zinsen;
        return result;
    }

}
