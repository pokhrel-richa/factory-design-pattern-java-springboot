package com.factorydesign.design.factory;

import com.factorydesign.design.factory.constants.VehicleTypeConstants;
import com.factorydesign.design.factory.impl.Bicycle;
import com.factorydesign.design.factory.impl.Bus;
import com.factorydesign.design.factory.impl.Car;
import com.factorydesign.design.factory.impl.Motorcycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class VehicleFactoryImplementation {
    @Autowired
    private Bicycle bicycle;
    @Autowired
    private Bus bus;
    @Autowired
    private Motorcycle motor;
    @Autowired
    private Car car;
    private static final Map<String, Vehicle> handler = new HashMap<String,Vehicle>();
    @PostConstruct
    private Map<String, Vehicle> getObject(){
        handler.put(VehicleTypeConstants.BICYCLE,bicycle);
        handler.put(VehicleTypeConstants.BUS,bus);
        handler.put(VehicleTypeConstants.MOTORCYCLE,motor);
        handler.put(VehicleTypeConstants.CAR, car);
        return handler;
    }
    public static Vehicle createInstance(String vehicle) throws Exception{
        return Optional.ofNullable(handler.get(vehicle)).orElseThrow(()-> new IllegalArgumentException("Invalid vehicle"));
    }

}
