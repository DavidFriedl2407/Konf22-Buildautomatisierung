package Recursion;

public class Uebung1 {
    public static void main(String[] args) {
        printFromZeroToNRecursive(5);
    }


    public static void printFromZeroToNRecursive(int n){
        //Abbruchsbestimmung

        if (n<0){
            return;
        }
        //rufe mich selbst nochmal auf
        printFromZeroToNRecursive(n-1);//n updaten (eins veringer)
        System.out.println("n= "+n);
}
}
