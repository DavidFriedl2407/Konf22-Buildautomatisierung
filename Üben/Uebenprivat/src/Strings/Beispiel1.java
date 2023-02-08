package Strings;

import static java.lang.Integer.parseInt;

public class Beispiel1 {
    public static void main(String[] args) {
        String string1 = "Wörter starten mit Großbuchstaben  ";

        string1.toCharArray();
        System.out.println(string1);
        System.out.println(string1.length());
        char [] array= string1.toCharArray();
        System.out.println(array);
        for (int i = 0; i < array.length-1; i++) {
            if (array[i]==' '){
                array[i+1]=Character.toUpperCase(array[i+1]);

            }
        }
        System.out.println(array);





    }

}
