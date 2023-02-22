package com.heima.stringdemo;

public class StringDemo1 {
    public static void main(String[] args) {
        String s1 = "abc1";
        System.out.println(s1);


        String s2 = new String();
        System.out.println("@" + s2 +"!");

        String s3 = new String("abc");
        System.out.println(s3);


        char[] chs = {'a', 'b', 'c', 'd'};
        String s4 = new String(chs);
        System.out.println(s4);

        //四种构造字符串的方法



        //P77 字符串的比较




    }
}
