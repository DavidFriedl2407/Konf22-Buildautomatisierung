public class Tagesabschnitt {
    /**
     * Retourniere Tagesabschnitt abhängig von der Uhrzeit
     * 6-9 (exkl.) -> Früh
     * 9-12 (exkl.) -> Vormittag
     * 12-16 (exkl.) -> Nachmittag
     * 16-20 (exkl.) -> Abend
     * 20-6 (exkl.) -> Nacht
     */
    public static void main(String[] args) {
      byte uhrzeit = 11;
      String abschnitt;

      if (uhrzeit<6 || uhrzeit>=20){
          abschnitt = "Nacht";
      } else if (uhrzeit<9) {
          abschnitt = "Früh";
      } else if (uhrzeit<12) {
          abschnitt = "Vormittag";
      }  else {
          abschnitt = "Abend";
      }
        System.out.println("abschnitt = "+abschnitt);
    }
}
