package Übungsblatt1und2und3;

public class Beispiel7UmsatzDemo {
    public static void main(String[] args) {
    double[] umsaetze= {1.5,4,20,3,3,837.23,77,88.88,1928,12,20,958};
        System.out.println(getUmsatzsteierungGT10(umsaetze));
    //int umsatzsteigerungenGT10 = getUmsatzsteierungGT10(umsaetze);
        //System.out.println("umsatzsteigerungenGT10= "+umsatzsteigerungenGT10);

    }
    public static int getUmsatzsteierungGT10(double[] umsaetze){
    int count=0;
    for (int i =0;i<umsaetze.length-1;i++){
        double vormonat = umsaetze[i];
        double monat= umsaetze[i+1];

        if (monat>vormonat){
            if ((monat-vormonat)/vormonat*100>=10){
                count++;
            }
        }
    }
    return count;
    }
}
