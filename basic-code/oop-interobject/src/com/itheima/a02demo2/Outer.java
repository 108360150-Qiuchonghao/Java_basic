package com.itheima.a02demo2;

public class Outer {

    String name;
    protected class Inner{

    }

    public Inner getInstance(){
        return new Inner();
    }
}
