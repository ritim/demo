package com.yao.demo.designpattern.bridge.airplane.maker;

public class AirBus extends AirplaneMaker{
    @Override
    public void produce() {
        System.out.println("This is AirBus to produce airplane");
    }
}
