package org.campus02.arrays;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class ArrayHelper {
    public static void main(String[] args) {


        int[] numbers = {8, 5, 1, 9, 0, 4};
        arrangeOrder(numbers);
        System.out.println(Arrays.toString(numbers));




    }


    public static void arrangeOrder(int[] numbers){

        int zaehler=0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length-i; j++) {
                if (numbers[j]<numbers[j-1]){
                    zaehler=numbers[j-1];
                    numbers[j-1]=numbers[j];
                    numbers[j]=zaehler;
                }
            }

        }

        }




        }






