package org.campus02.oop;

public abstract class Payment {
    private double amount;
    private String currency;

    public Payment(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
    public abstract double calcTransactionCosts();

    public double exchangeToEUR(){
        double Eur=0;
        switch (currency){
            case "EUR":
                Eur=amount;
                break;
            case "USD":
                Eur = amount / 1.1;
                break;
            case "GBP":
                Eur =amount/0.85;
                break;
            case "SEK":
                Eur=amount/9.5;
                break;
            case "HUF":
                Eur=amount/310;
                break;
            default:
                Eur=amount/2;
                break;

        }

        return Eur;
    }

    public String getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}

