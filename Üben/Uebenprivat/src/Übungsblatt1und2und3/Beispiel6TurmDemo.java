package Übungsblatt1und2und3;

public class Beispiel6TurmDemo {
    public static void main(String[] args) {
        int multiplicator1=2;


        int i=2;
        while (i<10){
            int result = i*multiplicator1;
            System.out.println(result+" zähler "+i+"*"+multiplicator1);
            i++;
            multiplicator1=result;

        }
        i=2;
        while (i<=9){
            int result =multiplicator1/i;
            System.out.println(result+" "+i);
            multiplicator1=result;
            i++;
        }

    }
}
