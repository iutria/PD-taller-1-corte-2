package com.iutria.fastandfurious.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Random;

@Getter
@Setter
public abstract class Automobile {
    protected int id;
    protected Date date;
    protected String color;
    protected Chassis chassis;
    protected Cushion cushion;
    protected Engine engine;

    public Automobile(
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
        this.id = new Random().nextInt(1000);
        this.date = date;
        this.color = color;
        this.chassis = new Chassis(chasisNumberAxles, chasisNumberPieces, chasisTransmissionType);
        this.cushion = new Cushion(cushionNumberPieces, cushionMaterial);
        this.engine = new Engine(enginePotential, engineNumberPieces, engineTecnology);
    }

    public abstract String getInfo();
}
