package arrays;

public class DemoAnwendung {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 8, 9, 2, 5};
        NumberHelper.isSortedArray(numbers);
        System.out.println("Rekursion orte");
        Ort graz = new Ort("graz");
        Ort wien = new Ort("wien");
        Ort marburg = new Ort("marburg");
        Ort linz = new Ort("linz");


        graz.addNachbar(marburg);
        graz.addNachbar(wien);
        wien.addNachbar(linz);
        linz.addNachbar(graz);
        marburg.addNachbar(graz);
        wien.addNachbar(graz);
        linz.addNachbar(wien);
        System.out.println("hasCircle(graz) = " + hasCircle(graz));

 ;

        System.out.println(graz.toString());
    }

        public static boolean hasCircle(Ort o) {
            return hasCircle(o, o, null);
        }

        public static boolean hasCircle(Ort start, Ort current, Ort previous) {

            for (Ort n : current.getNachbarn()) {
                if (n == previous) {
                    return false;
                }

                if (n == start) {
                    // Ich bin hier wieder am Startknoten
                    return true;
                }
                else {
                /*boolean result = hasCircle(start, n, current);
                if (result)
                    return true;
                */
                    if (hasCircle(start, n, current))
                        return true;
                }
            }
            return false;
        }





    }

