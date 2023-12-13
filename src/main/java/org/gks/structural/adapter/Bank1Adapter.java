package org.gks.structural.adapter;

public class Bank1Adapter implements BankApi {
    private final Bank1Api bank1Api;

    public Bank1Adapter() {
        bank1Api = new Bank1Api();
    }
    @Override
    public double getCurrentBalance() {
        return bank1Api.getBalanceBank1();
    }

    @Override
    public void transferAmount(String fromAccnt, String toAccnt, double amount) {
        bank1Api.sendMoneyBank1(fromAccnt, toAccnt, amount);
    }
}
