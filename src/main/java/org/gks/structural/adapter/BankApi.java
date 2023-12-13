package org.gks.structural.adapter;

public interface BankApi {
    double getCurrentBalance();
    void transferAmount(String fromAccnt, String toAccnt, double amount);
}
