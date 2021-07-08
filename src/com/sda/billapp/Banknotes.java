package com.sda.billapp;

public abstract class Banknotes implements PayableType {

    private int length;
    private int width;
    private int receivedHeight;
    private int receivedWidth;

    public Banknotes(int length, int width, int receivedHeight, int receivedWidth) {
        this.length = length;
        this.width = width;
        this.receivedHeight = receivedHeight;
        this.receivedWidth = receivedWidth;
    }

    @Override
    public boolean isFake() {
        return !(length == receivedHeight && width == receivedWidth);
    }
}
