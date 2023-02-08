package Übungsblatt1und2und3;

public class Beispiel8ReverseArray {
    public static void main(String[] args) {
      String[] namen={"Hallo","Max","Mustermann"};
        for (int i=0; i<namen.length; i++){
            System.out.println(namen[i]);
        }
        System.out.println("reverse");
        String[] reversed = reverseArray(namen);
        for (int i =0; i< reversed.length; i++){
            String output= reversed[i];
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
