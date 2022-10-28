package com.yao.demo.designpattern.bridge.airplane.category;

public class CargoPlane extends Airplane {
    @Override
    public void fly() {
        this.airplaneMaker.produce();
        System.out.println("This is CargoPlane to fly");
    }
}
