package org.campus02.oop;

public class MaestroPayment extends Payment{
    private String cardNumber;

    public MaestroPayment(double amount, String currency, String cardNumber) {
        super(amount, currency);
        this.cardNumber = cardNumber;
    }

    @Override
    public double calcTransactionCosts() {
        double transaktionskosten=exchangeToEUR()*0.0075;
        if (transaktionskosten<=0.95){
            return 0.95;
        }
        return transaktionskosten;
    }

    @Override
    public String toString() {
        return "MaestroPayment{" +
                "cardNumber='" + cardNumber + '\'' +
                "Amount=" + getAmount() +
                ", currency='" + getCurrency() + '\''+
                "TransactionCosts="+calcTransactionCosts()+
                '}';
    }
}
