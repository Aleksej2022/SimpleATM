package com.company.atm;

public class CheckingAccount extends Account{

    private double fee;

    public CheckingAccount(double balance, int pin, double fee) {
        super(balance, pin);
        this.fee = fee;
    }

    public double getFee() {
       return  fee;
    }
}
