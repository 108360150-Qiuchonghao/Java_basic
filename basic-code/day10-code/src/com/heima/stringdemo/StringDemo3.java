package com.heima.stringdemo;

import java.util.StringJoiner;

public class StringDemo3 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",","[","end");
        sj.add("aaa").add("bbb").add("ccc");
        System.out.println(sj);


        sj.toString();
        System.out.println(sj);
    }
}
