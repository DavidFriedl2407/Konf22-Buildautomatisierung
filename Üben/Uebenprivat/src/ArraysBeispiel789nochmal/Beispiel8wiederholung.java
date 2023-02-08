package ArraysBeispiel789nochmal;

public class Beispiel8wiederholung {
    public static void main(String[] args) {
        String[] array = {"Hallo", "Max", "Mustermann"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        /*String [] arrayToReverse={"Hallo","Max","Mustermann"};
        for (int i = 0; i < arrayToReverse.length; i++) {
            System.out.println(arrayToReverse[i]);
        }*/
        String [] hallo2 = {"Hallo","Max","Mustermann"};
        String[] hallo = reverseArray(hallo2);
        for (int i = 0; i < hallo.length; i++) {
            String output = hallo[i];
            System.out.println(output);
        }
    }
        public static String[] reverseArray(String[]arrayToReverse){
            String[] reversed= new String[arrayToReverse.length];
            for (int i = arrayToReverse.length-1,j=0;i>=0;i--,j++){
                String text = arrayToReverse[i];
                reversed[j]=text;
            }
            return reversed;

        }



}
