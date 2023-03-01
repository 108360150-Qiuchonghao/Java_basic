package com.itheima.a03demo3;

import java.io.IOException;

public class Runtimedemo1 {
    public static void main(String[] args) throws IOException {

        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);

        System.out.println(Runtime.getRuntime().totalMemory()/1024/1024);


        Runtime.getRuntime().exec("ls");


    }
}
