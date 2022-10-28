package com.yao.demo.designpattern.bridge.airplane;

import com.yao.demo.designpattern.bridge.airplane.category.CargoPlane;
import com.yao.demo.designpattern.bridge.airplane.category.PassengerPlane;
import com.yao.demo.designpattern.bridge.airplane.maker.AirBus;
import com.yao.demo.designpattern.bridge.airplane.maker.AirplaneMaker;
import com.yao.demo.designpattern.bridge.airplane.maker.Boeing;
import com.yao.demo.designpattern.bridge.airplane.maker.MD;

import java.util.ArrayList;
import java.util.List;

public class AirplaneMain {
    public static void main(String[] args){
        PassengerPlane passengerPlane = new PassengerPlane();
        CargoPlane cargoPlane = new CargoPlane();

        List<AirplaneMaker> airplaneMakerList = new ArrayList<>();
        AirBus airBus = new AirBus();
        Boeing boeing = new Boeing();
        MD md = new MD();
        airplaneMakerList.add(airBus);
        airplaneMakerList.add(boeing);
        airplaneMakerList.add(md);
        airplaneMakerList.forEach(airplaneMaker -> {
            passengerPlane.setAirplaneMaker(airplaneMaker);
            cargoPlane.setAirplaneMaker(airplaneMaker);
            passengerPlane.fly();
            cargoPlane.fly();
        });


    }
}
