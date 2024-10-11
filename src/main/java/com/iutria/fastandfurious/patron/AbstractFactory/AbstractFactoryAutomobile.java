package com.iutria.fastandfurious.patron.AbstractFactory;

import com.iutria.fastandfurious.models.Automobile;
import com.iutria.fastandfurious.modelsDTO.AutomobileDTO;

public interface AbstractFactoryAutomobile {
    Automobile createVehicle(AutomobileDTO automobileDTO);
}
