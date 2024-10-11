package com.iutria.fastandfurious.patron.AbstractFactory;


import com.iutria.fastandfurious.models.Automobile;
import com.iutria.fastandfurious.models.FordAutomobile;
import com.iutria.fastandfurious.modelsDTO.AutomobileDTO;

public class ConcreteFactoryAutomobileFord implements AbstractFactoryAutomobile{

    @Override
    public Automobile createVehicle(AutomobileDTO automobileDTO) {
        return new FordAutomobile(
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
