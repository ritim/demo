package com.yao.demo.designpattern.bridge;

public class ConcreteImplementorA extends Implementor{
    @Override
    public void operationImp() {
        System.out.println("This is concreteImplementorA to implement operation");
    }
}
