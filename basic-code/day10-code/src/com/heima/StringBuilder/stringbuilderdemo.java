package com.heima.StringBuilder;

public class stringbuilderdemo {
    public static void main(String[] args) {
        StringBuilder   sb = new StringBuilder();

        sb.append(1);
        sb.append(2.3);
        sb.append(true);

        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);




    }
}
