package org.campus02.oop;

public class CashPayment extends Payment{
    private String name;

    public CashPayment(double amount, String currency) {
        super(amount, currency);

    }

    public CashPayment(double amount, String currency, String name) {
        super(amount, currency);
        this.name = name;
    }

    @Override
    public double calcTransactionCosts() {
        if (name==null){
            return 2;
        }
        else

        return 0;
    }

    @Override
    public String toString() {
        return "CashPayment{" +
                "name='" + name + '\'' +
                "Amount=" + getAmount() +
                ", currency='" + getCurrency() + '\''+
                "TransactionCosts="+calcTransactionCosts()+
                '}';
    }
}
