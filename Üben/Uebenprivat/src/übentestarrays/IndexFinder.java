package übentestarrays;

import java.lang.reflect.Array;

public class IndexFinder {
    public static void main(String[] args) {
       int [] numbers={0,1,9,7};
       int searchNumber=9;
       findIndexForNumber(numbers,searchNumber);
        System.out.println(findIndexForNumber(numbers,searchNumber));
        int expectedSum=8;
        findIndicesForExpectedSum(numbers,searchNumber);
        System.out.println(findIndicesForExpectedSum(numbers,searchNumber).toString());





    }



    public static int findIndexForNumber(int [] numbers, int searchNumber){
        int index=-1;
        for (int i = 0; i < numbers.length; i++) {
           if (numbers[i] ==(searchNumber)){
               index=i;
           }
        }
        return index;
    }
    public static int[] findIndicesForExpectedSum(int [] numbers, int expectedSum){
        int [] newarray=new int[2];
        int h=0;
        int z=0;
        for (int y = 0; y < numbers.length; y++) {


        for (int i = 0; i < numbers.length; i++) {
        z=numbers[y]+numbers[i];
        if (z == expectedSum){
            newarray[h]=y;
            if (newarray[1]==newarray[h]){
                return newarray;
            }
            else {
                h++;
            }



        }
        }
        }


        return newarray;
    }
}
