package com.yao.demo.designpattern.bridge.airplane.category;

import com.yao.demo.designpattern.bridge.airplane.maker.AirplaneMaker;

public abstract class Airplane {
    protected AirplaneMaker airplaneMaker;
    public void setAirplaneMaker(AirplaneMaker airplaneMaker){
        this.airplaneMaker = airplaneMaker;
    };
    public abstract void fly();
}
