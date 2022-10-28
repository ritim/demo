package com.yao.demo.designpattern.bridge;

public abstract class Abstraction {
    protected Implementor imp;

    /**
     * Implement business method
     */
    public void operation(){
        imp.operationImp();
    }
}
