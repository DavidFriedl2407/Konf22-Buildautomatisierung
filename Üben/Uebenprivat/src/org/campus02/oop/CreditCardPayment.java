package org.campus02.oop;

import java.util.Objects;

public class CreditCardPayment extends Payment {
    private String cardNumber;
    private String securityNumber;

    public CreditCardPayment(double amount, String currency, String cardNumber, String securityNumber) {
        super(amount, currency);
        this.cardNumber = cardNumber;
        this.securityNumber = securityNumber;
    }


    @Override
    public double calcTransactionCosts() {

        if (super.getCurrency().equals("EUR")) {
            return 0.5+exchangeToEUR()*0.011;
        }
        else {
            return 1.5+exchangeToEUR()*0.0275;
        }

    }


    @Override
    public String toString() {
        return "CreditCardPayment{" +
                "cardNumber='" + cardNumber + '\'' +
                ", securityNumber='" + securityNumber + '\'' +
                "Amount=" + getAmount() +
                ", currency='" + getCurrency() + '\''+
                "TransactionCosts="+calcTransactionCosts()+
                '}';
    }
}
