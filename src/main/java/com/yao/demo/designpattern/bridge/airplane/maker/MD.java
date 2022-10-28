package com.yao.demo.designpattern.bridge.airplane.maker;

import com.yao.demo.designpattern.bridge.airplane.maker.AirplaneMaker;

public class MD extends AirplaneMaker {
    @Override
    public void produce() {
        System.out.println("This is MD to produce airplane");
    }
}
