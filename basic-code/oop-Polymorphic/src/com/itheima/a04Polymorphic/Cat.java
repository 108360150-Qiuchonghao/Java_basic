package com.itheima.a04Polymorphic;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    public void catchMous(){
        System.out.println("猫在抓老鼠");
    }

    @Override
    public void Eat(String something) {
        System.out.println(getAge()+"岁的"+getColor()+"颜色的猫咪眯着眼睛侧着头吃"+something);
    }


}
