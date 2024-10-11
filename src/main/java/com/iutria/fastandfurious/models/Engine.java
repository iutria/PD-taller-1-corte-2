package com.iutria.fastandfurious.models;

public class Engine {
    private double potential;
    private int numberPieces;
    private String tecnology;

    public Engine(double potential, int numberPieces, String tecnology) {
        this.potential = potential;
        this.numberPieces = numberPieces;
        this.tecnology = tecnology;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "potential=" + potential +
                ", numberPieces=" + numberPieces +
                ", tecnology='" + tecnology + '\'' +
                '}';
    }
}
