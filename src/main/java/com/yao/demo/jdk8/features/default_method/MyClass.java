package com.yao.demo.jdk8.features.default_method;

public class MyClass implements InterfaceA, InterfaceB{

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }

    public void sayWorld(){
        InterfaceA.super.sayWorld();
        //System.out.println("MyWorld");
    }

    public static void main(String[] args){
        MyClass myClass = new MyClass();
        myClass.sayHello();
        myClass.sayWorld();
        myClass.sayBeautiful();
    }
}
