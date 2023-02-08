package Recursion;

public class Printer {
    public static void main(String[] args) {
       printFromNToZero(5);
        System.out.println("zweiter versuch");
       printFromNToZeroRecursive(5);
    }
    //Methodendeklaration
    public static void printFromNToZero (int n){
        while (n>=0){
            System.out.println("n= "+n);
            n--;

        }
    }

    public static void printFromNToZeroRecursive(int n){
        //Abbruchsbestimmung
        if (n<0){
            return;
        }
        System.out.println("n= "+n);
        //rufe mich selbst nochmal auf
        printFromNToZeroRecursive(n-1);//n updaten (eins veringer)
    }

}
