package com.factorydesign.design.factory.impl;

import com.factorydesign.design.factory.Vehicle;
import org.springframework.stereotype.Component;

@Component
public class Bicycle implements Vehicle {
    public String specification(){
        return "This is bicycle, its speed depends on the way you ride it";
    }


}
