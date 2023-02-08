package ArraysBeispiel789nochmal;

public class Beispiel7wiederholung {
    public static void main(String[] args) {
        double [] umsaetze={1.5,4,20,3,3,837.23,77,88.88,1928,12,20,958};
        System.out.println(getUmsatzsteigerungGT10(umsaetze));
    }
    public static int getUmsatzsteigerungGT10(double[] umsaetze){
        int counter = 0;
        for (int i = 0; i < umsaetze.length-1; i++) {

            double vormonat= umsaetze[i];
            double monat= umsaetze[i+1];

            if (monat>vormonat){

                if (monat*100/vormonat>=vormonat*1.1){
                    counter++;
                }
            }


        }
        return counter;
    }


}
