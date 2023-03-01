package com.itheima.a02demo2;

public class Test {
    public static void main(String[] args) {

        Outer.Inner oi = new Outer().new Inner();

        Outer o = new Outer();
        System.out.println(o.getInstance());


    }
}
