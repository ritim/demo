package com.yao.demo.jdk8.features.default_method;

public interface InterfaceB {
    public void sayHello();
    default void sayWorld(){
        System.out.println("World B");
    }
}
