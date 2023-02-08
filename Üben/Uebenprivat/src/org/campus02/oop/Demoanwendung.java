package org.campus02.oop;

public class Demoanwendung {
    public static void main(String[] args) {
        CreditCardPayment creditcard=new CreditCardPayment(5,"EUR","AT55555","876");
        CreditCardPayment creditcard1=new CreditCardPayment(5,"EUR","AT55555","876");

        System.out.println(creditcard.getCurrency());
        System.out.println(creditcard.calcTransactionCosts());
        System.out.println(creditcard.toString());
        CashPayment cashPayment=new CashPayment(5,"USD");
        System.out.println(cashPayment);
        System.out.println(cashPayment.calcTransactionCosts());
        MaestroPayment maestroPayment=new MaestroPayment(88888,"EUR","1185");
        System.out.println(maestroPayment);
        System.out.println(maestroPayment.calcTransactionCosts());
        PaymentJournal paymentJournal=new PaymentJournal();
        paymentJournal.add(creditcard1);
        paymentJournal.add(cashPayment);
        paymentJournal.add(maestroPayment);
        paymentJournal.add(creditcard);
        System.out.println(paymentJournal.totalTransactionCosts());
        System.out.println(paymentJournal.getPaymentsPerCurrency());








        }
    }

