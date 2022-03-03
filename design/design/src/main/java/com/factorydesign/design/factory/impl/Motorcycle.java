package com.factorydesign.design.factory.impl;

import com.factorydesign.design.factory.Vehicle;
import org.springframework.stereotype.Component;

@Component
public class Motorcycle implements Vehicle {

    @Override
    public String specification() {
        return "this is Motor Cycle with the maximum speed of 300km/hr";
    }
}
