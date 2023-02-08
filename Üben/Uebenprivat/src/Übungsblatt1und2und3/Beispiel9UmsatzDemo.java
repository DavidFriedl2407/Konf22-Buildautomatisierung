package Übungsblatt1und2und3;

public class Beispiel9UmsatzDemo {
    public static void main(String[] args) {
        double[][] tagesUmsaetzeProWoche = {
                {11, 12, 13, 14, 15}, //1. Woche
                {21, 22, 23, 24, 25}, //2. Woche
                {31, 32, 33, 34, 35}, //3. Woche
                {41, 42, 43, 44, 45}  //4. Woche
        };
        double[] umsaetzeProWoche = calculateSumByWeek(tagesUmsaetzeProWoche);
        for (int i = 0; i < umsaetzeProWoche.length; i++) {
            System.out.println("umsatz in Woche " + (i + 1) + " = " + umsaetzeProWoche[i]);
        }

    }

    public static double[] calculateSumByWeek(double[][] umsaetze) {
        double[] wochenUmsaetze = new double[umsaetze.length];
        for (int i = 0; i < umsaetze.length; i++) {
            double[] umsaetzeProWoche = umsaetze[i];
            for (int j = 0; j < umsaetzeProWoche.length; j++) {
                double tagesUmsatz = umsaetzeProWoche[j];
                wochenUmsaetze[i] += tagesUmsatz;
            }
        }
        return wochenUmsaetze;
    }
}
