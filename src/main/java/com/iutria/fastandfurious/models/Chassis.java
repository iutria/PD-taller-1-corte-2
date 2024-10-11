package com.iutria.fastandfurious.models;

public class Chassis {
    private int numberAxles;
    private int numberPieces;
    private String transmissionType;

    public Chassis(int numberAxles, int numberPieces, String transmissionType) {
        this.numberAxles = numberAxles;
        this.numberPieces = numberPieces;
        this.transmissionType = transmissionType;
    }

    @Override
    public String toString() {
        return "Chassis{" +
                "numberAxles=" + numberAxles +
                ", numberPieces=" + numberPieces +
                ", transmissionType='" + transmissionType + '\'' +
                '}';
    }
}

