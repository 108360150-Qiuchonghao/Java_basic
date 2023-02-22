package com.heima.stringcomparedemo;

public class StringCmp {
    public static void main(String[] args) {
//        String str1 = new String("abc");
//        String str2 = "abc"; //在串池
//        System.out.println("第一种情况："+str1 == str2);

        String s1 = new String("abc");
        String s2 = "ABC";

        // == 号比较
        // 基本数据类型；比的是数据值
        // 应用数据类型； 比的是地址值

        System.out.println( s1 == s2);

        boolean result1 =  s1.equals(s2);
        System.out.println(result1);
        boolean result2 = s1.equalsIgnoreCase(s2);
        System.out.println(result2);



    }
}
