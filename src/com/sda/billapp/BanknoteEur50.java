package com.sda.billapp;

public class BanknoteEur50 extends Banknotes {

    public BanknoteEur50(int receivedHeight, int receivedWidth) {
        super(10,5, receivedHeight, receivedWidth);
    }

    @Override
    public int getValue() {
        return 50;
    }

    @Override
    public CurrencyType getCurrency() {
        return CurrencyType.EUR;
    }
}
