package com.iutria.fastandfurious.controllers;

import com.iutria.fastandfurious.models.Automobile;
import com.iutria.fastandfurious.modelsDTO.AutomobileDTO;
import com.iutria.fastandfurious.patron.AbstractFactory.AbstractFactoryAutomobile;
import com.iutria.fastandfurious.patron.SimpleFactory.SimpleFactoryAutomobile;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
    @PostMapping("/create")
    public String index(@RequestBody AutomobileDTO automobileDTO) {
        AbstractFactoryAutomobile factoryAutomobile = SimpleFactoryAutomobile.build(automobileDTO.getType());
        Automobile automobile = factoryAutomobile.createVehicle(automobileDTO);
        return automobile.getInfo();
    }

    @PostMapping("/create2")
    public AutomobileDTO post(@RequestBody AutomobileDTO automobileDTO) {
        return automobileDTO;
    }
}
