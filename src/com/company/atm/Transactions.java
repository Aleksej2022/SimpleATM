package com.company.atm;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public interface Transactions {

    LocalDateTime dateTime = LocalDateTime.now();
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy:MM:dd - HH:mm:ss");
    String dateTimeFormat = dateTime.format(dateFormat);

    boolean withdraw(double debitAmt);
    boolean deposit(double creditAmt);
    double getBalance();

    static boolean recordTransaction(double transactionAmt, String transactionType){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("transactions.txt", true))) {
            writer.write((transactionType == "Credit") ? "\n\tAmount credited: $" + transactionAmt + "\tDate: " + dateTimeFormat
                    : "\n\tAmount debited: $" + transactionAmt + "\tDate: " + dateTimeFormat);
        } catch (IOException e) {
            System.out.println("Error occurred writing to file");
            e.printStackTrace();
        }
        return true;
    }
}
