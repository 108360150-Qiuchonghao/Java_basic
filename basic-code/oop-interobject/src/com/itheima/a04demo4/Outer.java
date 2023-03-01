package com.itheima.a04demo4;

public class Outer {
    public void show(){
        int a = 10;
        class Inner{
            String name;
            static int age;
            public void method1(){
                System.out.println("method1 function");
            }
            public static void method2(){
                System.out.println("method2 function");
            }
        }

        Inner i = new Inner();
        i.method1();
        Inner.method2();
    }
}
