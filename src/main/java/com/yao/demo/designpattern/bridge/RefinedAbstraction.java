package com.yao.demo.designpattern.bridge;

public class RefinedAbstraction extends Abstraction{
    /**
     * Business implementation
     */
    public void operation(){
        System.out.println("Business implementation in RefinedAbstraction");
    }
}
