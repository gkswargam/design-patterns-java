package org.gks.structural.adapter;

public class Bank2Api {
    private double balance;
    public double getBalanceBank2() {
        System.out.println("Bank2 balance is " + balance);
        return balance;
    }

    public void sendMoneyBank2(String fromAcct, String toAccnt, double amount) {
        System.out.println("Bank2 is sending money " + amount  + " from " + fromAcct + " to " + toAccnt );
    }
}
