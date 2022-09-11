package com.company.atm;

public class SavingsAccount extends Account{

    private float interestRate;
    public SavingsAccount(double balance, int pin, float rate) {
        super(balance, pin);
        this.interestRate = rate;
    }

    public double calculateInterest(){
        double interest = this.getBalance() * this.interestRate;
        return interest;
    }
}
