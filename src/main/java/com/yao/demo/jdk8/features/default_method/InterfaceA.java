package com.yao.demo.jdk8.features.default_method;

public interface InterfaceA {
    public void sayHello();
    default void sayWorld(){
        System.out.println("World A");
    }

    default void sayBeautiful(){
        System.out.println("It is beautiful");
    }
}
