package UebenMitMarkusStoff;

import java.util.Random;

public class Schleife6 {
    public static void main(String[] args) {
        Random numberGenerator = new Random();
        int randomNumber = numberGenerator.nextInt(10) + 1;

        for (int i = randomNumber; i <=7 ; i++) {
            System.out.println(randomNumber);
            randomNumber = numberGenerator.nextInt(10) + 1;
            if (randomNumber==7){
                break;
            }

        }


    }
}
