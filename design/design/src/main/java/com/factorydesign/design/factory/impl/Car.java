package com.factorydesign.design.factory.impl;

import com.factorydesign.design.factory.Vehicle;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
    public String specification(){
        return "This is Car with with the maximum speed of  200km/hr";
    }
}
