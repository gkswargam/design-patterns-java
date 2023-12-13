package org.gks.structural.adapter;

public class Bank2Adapter implements BankApi {
    private final Bank2Api bank2Api;

    public Bank2Adapter() {
        bank2Api = new Bank2Api();
    }
    @Override
    public double getCurrentBalance() {
        return bank2Api.getBalanceBank2();
    }

    @Override
    public void transferAmount(String fromAccnt, String toAccnt, double amount) {
        bank2Api.sendMoneyBank2(fromAccnt, toAccnt, amount);
    }
}
