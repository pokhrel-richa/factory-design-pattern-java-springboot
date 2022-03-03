package com.factorydesign.design.controller;

import com.factorydesign.design.factory.Vehicle;
import com.factorydesign.design.factory.VehicleFactoryImplementation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactoryController {
    @GetMapping("vehicle/{vehicle-type}")
    public String getVehicleTypeInfo(@PathVariable("vehicle-type") String vehicle) throws Exception{
        Vehicle vehicleFactory  = VehicleFactoryImplementation.createInstance(vehicle);
        return vehicleFactory.specification();
    }

}
