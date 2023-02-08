package UebenMitMarkusStoff;

import java.util.Random;

public class Schleifen {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        System.out.println("randomNumbers");

    Random numberGenerator= new Random();

    int randomNumber = numberGenerator.nextInt(6)+1;
    int anotherRandomNumber = numberGenerator.nextInt(6)+1;

        for (int i = 1; i < 7; i++) {
            System.out.println(randomNumber);
            System.out.println(anotherRandomNumber);

        }

}
}
