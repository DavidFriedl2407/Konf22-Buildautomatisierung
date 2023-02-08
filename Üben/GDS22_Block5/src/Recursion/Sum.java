package Recursion;

import java.util.ArrayList;

public class Sum {
    public static void main(String[] args) {
        System.out.println(sumUpIterative(3));
        System.out.println(sumUpRecursive(3));
        System.out.println(sumUpRecursiveAcc(3, 0));
        System.out.println("ArrayList");
        ArrayList<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        System.out.println(interativSum(values));
        System.out.println(recursiveSum(values));



    }

    public static int sumUpIterative(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            //beginne mit 1
            //laufe solange du kleiner gleich n bist
            //erhöhe nach jeder Iteration um i um 1
            sum = sum + i;

        }
        return sum;
    }

    public static int sumUpRecursive(int n) {
        if (n <= 0) {
            return n;
        }
        return n + sumUpRecursive(n - 1);
    }

    public static int sumUpRecursiveAcc(int n, int acc) {
        // abbruchsbestimmung
        if (n <= 0) {
            return acc;
        }
        acc = acc + n;
        return sumUpRecursiveAcc(n - 1, acc);
    }

    public static int interativSum (ArrayList<Integer> values) {
        int sum=0;
        for(Integer value : values) {
           sum+=value; //sum=sum+value
        }

        return sum;

    }
    public static int recursiveSum (ArrayList<Integer>values){
        if (values.size()==0){
            return 0;
        }Integer value=values.remove(0);
        return value+recursiveSum(values);
    }
}