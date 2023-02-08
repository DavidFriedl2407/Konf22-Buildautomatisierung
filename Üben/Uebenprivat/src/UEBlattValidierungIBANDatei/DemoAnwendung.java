package UEBlattValidierungIBANDatei;

import java.util.Arrays;
import java.util.Scanner;

public class DemoAnwendung {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        IbanValidationService neueriban= new IbanValidationService(scanner.next());
        System.out.println(neueriban.getCountryCode());
        System.out.println("................");
        System.out.println(neueriban.getCheckSum());
        System.out.println(neueriban.getAccountNumber());
        System.out.println("iteratiom2");
        System.out.println(neueriban.getCountryCodeNumber());
        System.out.println(neueriban.getFullCode());
        System.out.println("Iteration3");
        int[] arr = neueriban.buildArray();
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("Iteration 4");
        System.out.println(neueriban.calcCheckSum());
        System.out.println(neueriban.isIbanCorrect());







    }
}
