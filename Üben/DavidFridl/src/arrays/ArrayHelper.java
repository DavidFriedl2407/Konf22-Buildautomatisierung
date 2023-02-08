package arrays;

import java.util.Random;

public class ArrayHelper {
    public static void main(String[] args) {
        ArrayHelper arrayHelper = new ArrayHelper();
        int sizeOfArray = 6;
        int maxValue = 45;
        int[] array=createINTArray(sizeOfArray,maxValue);
        System.out.println("Die Glückszahl an der Stelle"+createINTArray(sizeOfArray,maxValue));
        for (int i = 0; i < array.length; i++) {
            System.out.println("Die Glückszahl an der Stelle"+i+"lautet"+array[i]);

        }
    }

        public static int[] createINTArray ( int sizeOfArray, int maxValue){
            int[] array=new int[sizeOfArray];


                for (int i = 0; i < array.length; i++) {
                    int zahl=new Random().nextInt(maxValue+1);
                    if (zahl<=maxValue&&zahl>=1){

                    array[i]=zahl;

                }
            }


            return array;
        }
        public static boolean validateTipp(int [] array){
            for (int y = 0; y < array.length; y++) {
                for (int i = 0; i < array.length; i++) {
                    if (array[y] ==array[i]){
                        return false;
                    }
                }
            }

        return true;
        }


    }

