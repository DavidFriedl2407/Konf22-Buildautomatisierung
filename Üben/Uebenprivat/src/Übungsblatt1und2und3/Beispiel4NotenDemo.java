package Übungsblatt1und2und3;

public class Beispiel4NotenDemo {
    public static void main(String[] args) {
        System.out.println(getNotentext(70));
        System.out.println(getNotentext(95));
        System.out.println(getNotentext(40));
    }
    public static String getNotentext(int punkte){
        if (punkte>=90){
            return "Sehr Gut";
        } else if (punkte<90 && punkte>=78) {
            return "Gut";
        } else if (punkte<=77 && punkte>=65) {
            return "Befriedigend";
        } else if (punkte<=64 && punkte>=51) {
            return "Genügend";
        } else   {
            return "Ungenügend";
        }

    }
}
