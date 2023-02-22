package com.heima.stringcomparedemo;

public class phonenumber {
    public static void main(String[] args) {
        String PhoneNumber = "13511394990";

        String start = PhoneNumber.substring(0,3);
        String end = PhoneNumber.substring(7);

        System.out.println(start+"****"+end);

    }
}
