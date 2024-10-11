package com.iutria.fastandfurious.patron.AbstractFactory;

import com.iutria.fastandfurious.models.Automobile;
import com.iutria.fastandfurious.models.MazdaAutomobile;
import com.iutria.fastandfurious.modelsDTO.AutomobileDTO;

public class ConcreteFactoryAutomobileMazda implements AbstractFactoryAutomobile{
    @Override
    public Automobile createVehicle(AutomobileDTO automobileDTO) {
        return new MazdaAutomobile(
                automobileDTO.getDate(),
                automobileDTO.getColor(),
                automobileDTO.getChasisNumberAxles(),
                automobileDTO.getChasisNumberPieces(),
                automobileDTO.getChasisTransmissionType(),
                automobileDTO.getCushionNumberPieces(),
                automobileDTO.getCushionMaterial(),
                automobileDTO.getEnginePotential(),
                automobileDTO.getEngineNumberPieces(),
                automobileDTO.getEngineTecnology()
        );
    }
}
