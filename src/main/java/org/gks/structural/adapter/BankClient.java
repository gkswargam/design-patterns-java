package org.gks.structural.adapter;

public class BankClient {
    public static void main(String[] args) {
        BankApi bankApi = new Bank2Adapter();
        bankApi.getCurrentBalance();
        bankApi.transferAmount("acnt-1", "accnt-2", 1000);
    }
}
