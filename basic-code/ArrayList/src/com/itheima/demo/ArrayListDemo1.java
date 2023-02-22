package com.itheima.demo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<String>();


        ArrayList<String> list = new ArrayList<>( );
        System.out.println(list);

        list.add("First Element");
        list.add("bbbb");
        list.add("cccc");

        System.out.println(list);

        System.out.println("[");
        for(int i = 0; i < list.size(); i++){
            if(i == list.size()-1){
                System.out.print(list.get(i));
            }else{
                System.out.print(list.get(i)+";");
            }
        }
        System.out.println("]");








    }
}
