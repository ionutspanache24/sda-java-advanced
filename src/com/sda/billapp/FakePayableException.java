package com.sda.billapp;

public class FakePayableException extends Exception {

    private PayableType payableType;

    public FakePayableException(PayableType payableType) {
        super("Payable is fake");
        this.payableType = payableType;
    }

    public PayableType getPayableType() {
        return payableType;
    }
}
