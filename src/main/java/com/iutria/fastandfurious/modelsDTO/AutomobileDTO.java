package com.iutria.fastandfurious.modelsDTO;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
public class AutomobileDTO {
    private Date date;
    private String color;
    private String type;
    private int chasisNumberAxles;
    private int chasisNumberPieces;
    private String chasisTransmissionType;
    private int cushionNumberPieces;
    private String cushionMaterial;
    private double enginePotential;
    private int engineNumberPieces;
    private String engineTecnology;

    @Override
    public String toString() {
        return "AutomobileDTO{" +
                "date=" + date +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", chasisNumberAxles=" + chasisNumberAxles +
                ", chasisNumberPieces=" + chasisNumberPieces +
                ", chasisTransmissionType='" + chasisTransmissionType + '\'' +
                ", cushionNumberPieces=" + cushionNumberPieces +
                ", cushionMaterial='" + cushionMaterial + '\'' +
                ", enginePotential=" + enginePotential +
                ", engineNumberPieces=" + engineNumberPieces +
                ", engineTecnology='" + engineTecnology + '\'' +
                '}';
    }
}
