package com.iutria.fastandfurious.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cushion {
    private int numberPieces;
    private String material;

    public Cushion(int numberPieces, String material) {
        this.numberPieces = numberPieces;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Cushion{" +
                "numberPieces=" + numberPieces +
                ", material='" + material + '\'' +
                '}';
    }
}
