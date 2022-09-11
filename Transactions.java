public interface Transactions {

    boolean withdraw(double debitAmt);
    boolean deposit(double creditAmt);
    double getBalance();
}
