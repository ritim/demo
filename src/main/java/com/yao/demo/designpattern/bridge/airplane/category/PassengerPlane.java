package com.yao.demo.designpattern.bridge.airplane.category;

public class PassengerPlane extends Airplane {
    @Override
    public void fly() {
        this.airplaneMaker.produce();
        System.out.println("This is PassengerPlane to fly");
    }
}
