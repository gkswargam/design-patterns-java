package org.gks.structural.adapter;

public class Bank1Api {
    private double balance;
    public double getBalanceBank1() {
        System.out.println("Bank1 balance is " + balance);
        return balance;
    }

    public void sendMoneyBank1(String fromAcct, String toAccnt, double amount) {
        System.out.println("Bank1 is sending money " + amount  + " from " + fromAcct + " to " + toAccnt );
    }
}
