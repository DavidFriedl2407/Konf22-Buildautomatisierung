package arrays;

import java.sql.Array;

public class NumberHelper {



    public static boolean isSortedArray(int[] numbers) {
        boolean counter =false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<numbers[i+1]){
                counter=true;
            }
            if (numbers[i]>numbers[i+1]){
                counter=false;
                break;
            }

        }


        return counter;
    }
    public static int[] removeDuplicates(int[] numbers){
        int[] array= numbers;
        int counter=0;

        for (int i = 0; i < numbers.length; i++) {


            if (numbers[counter]!=array[i+1]){
                counter++;
            }
            else { numbers[counter]=-1;

        }


    }
        return numbers;
}}
