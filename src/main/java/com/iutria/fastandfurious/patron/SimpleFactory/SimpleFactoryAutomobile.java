package com.iutria.fastandfurious.patron.SimpleFactory;

import com.iutria.fastandfurious.patron.AbstractFactory.AbstractFactoryAutomobile;
import com.iutria.fastandfurious.patron.AbstractFactory.ConcreteFactoryAutomobileFord;
import com.iutria.fastandfurious.patron.AbstractFactory.ConcreteFactoryAutomobileMazda;
import com.iutria.fastandfurious.patron.AbstractFactory.ConcreteFactoryAutomobileToyota;

public class SimpleFactoryAutomobile {
    public static AbstractFactoryAutomobile build(String type){
        switch (type){
            case "MAZDA": return new ConcreteFactoryAutomobileMazda();
            case "TOYOTA": return new ConcreteFactoryAutomobileToyota();
            case "FORD": return new ConcreteFactoryAutomobileFord();
            default: return null;
        }
    }
}
