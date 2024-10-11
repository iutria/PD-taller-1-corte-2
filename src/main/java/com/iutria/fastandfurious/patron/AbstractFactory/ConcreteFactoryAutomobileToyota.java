package com.iutria.fastandfurious.patron.AbstractFactory;

import com.iutria.fastandfurious.models.Automobile;
import com.iutria.fastandfurious.models.ToyotaAutomobile;
import com.iutria.fastandfurious.modelsDTO.AutomobileDTO;

public class ConcreteFactoryAutomobileToyota implements AbstractFactoryAutomobile{
    @Override
    public Automobile createVehicle(AutomobileDTO automobileDTO) {
        return new ToyotaAutomobile(
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
