package org.campus02.oop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PaymentJournal {
    private List<Payment> paymentlist=new ArrayList<>();

    public void add(Payment p){
        paymentlist.add(p);
    }
    public double totalTransactionCosts(){
        double totaltrco=0;
        for (Payment payment : paymentlist) {
            totaltrco= totaltrco+payment.calcTransactionCosts();
        }
        return totaltrco;
    }
    public HashMap<String, Double> getPaymentsPerCurrency(){
        HashMap hashMap=new HashMap<>();

        for (Payment payment : paymentlist) {
            if (hashMap.containsKey(payment.getCurrency())){
                Integer count= (Integer) hashMap.get(payment.getCurrency());

                count++;
                hashMap.put(payment.getCurrency(),count);
            }
            else {
                hashMap.put(payment.getCurrency(),1);
            }
        }



        return hashMap;
    }
}
