package com.yao.demo.designpattern.bridge.airplane.maker;

public class Boeing extends AirplaneMaker{
    @Override
    public void produce() {
        System.out.println("This is Boeing to produce airplane");
    }
}
