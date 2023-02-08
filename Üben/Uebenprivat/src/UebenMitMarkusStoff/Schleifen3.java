package UebenMitMarkusStoff;

import java.util.Random;

public class Schleifen3 {
    public static void main(String[] args) {
        Random numberGenerator = new Random();
        int randomNumber = numberGenerator.nextInt(10) + 1;
        int anotherRandomNumber = numberGenerator.nextInt(10) + 1;
        int anotherRandomNumber2 = numberGenerator.nextInt(10) + 1;
        int e = 0;

        if (anotherRandomNumber2 - anotherRandomNumber > 0) {
            e = e + anotherRandomNumber2 - anotherRandomNumber;
        }
        if (anotherRandomNumber - anotherRandomNumber2 > 0) {
            e = e + anotherRandomNumber - anotherRandomNumber2;
        }


        if (anotherRandomNumber > anotherRandomNumber2) {
            for (int j = anotherRandomNumber2; j < anotherRandomNumber + 1; j++) {
                System.out.println(j);
            }

        }
        if (anotherRandomNumber2 > anotherRandomNumber) {
            for (int j = anotherRandomNumber; j < anotherRandomNumber2 + 1; j++) {
                System.out.println(j);
            }



        }
        if (anotherRandomNumber2==anotherRandomNumber){
            System.out.println("gleiche Zahlen");
        }


        System.out.println("versuch");
        for (int i = 0; i < 10; i++) {
            int randomNumber3 = numberGenerator.nextInt(10) + 1;
            System.out.println(randomNumber3);

        }


    }
}
