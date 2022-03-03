package com.factorydesign.design.factory.impl;

import com.factorydesign.design.factory.Vehicle;
import org.springframework.stereotype.Component;

@Component
public class Bus implements Vehicle {
    public String specification(){
        return "This is Bus with the maximum speed of 150km/hr";
    }

}
