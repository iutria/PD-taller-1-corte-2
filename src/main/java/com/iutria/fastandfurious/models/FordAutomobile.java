package com.iutria.fastandfurious.models;

import java.util.Date;

public class FordAutomobile extends Automobile{

    public FordAutomobile(
            Date date,
            String color,
            int chasisNumberAxles,
            int chasisNumberPieces,
            String chasisTransmissionType,
            int cushionNumberPieces,
            String cushionMaterial,
            double enginePotential,
            int engineNumberPieces,
            String engineTecnology
    ) {
        super(
                date,
                color,
                chasisNumberAxles,
                chasisNumberPieces,
                chasisTransmissionType,
                cushionNumberPieces,
                cushionMaterial,
                enginePotential,
                engineNumberPieces,
                engineTecnology
        );
    }

    @Override
    public String getInfo() {
        return "FordAutomobile{" +
                "id=" + id +
                ", date=" + date +
                ", color='" + color + '\'' +
                ", chassis=" + chassis +
                ", cushion=" + cushion +
                ", engine=" + engine +
                '}';
    }
}