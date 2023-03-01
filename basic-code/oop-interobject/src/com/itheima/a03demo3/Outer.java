package com.itheima.a03demo3;

public class Outer {
    private int a = 10;

    class Inter{
        private int a = 20;
        public void show(){
            int a = 30;
            System.out.println(Outer.this.a);
            System.out.println(this.a);
            System.out.println(a);
        }
    }
}
