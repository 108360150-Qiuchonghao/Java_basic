package com.itheima.demo;

import java.util.ArrayList;

public class Test7 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        User u1 = new User("harry1", "1","1234");
        User u2 = new User("harry2", "2","12345");
        User u3 = new User("harry3", "3","12346");

        list.add(u1);
        list.add(u2);
        list.add(u3);

        System.out.println(Findindex(list,"4"));
        System.out.println(Findindex(list,"2"));

        System.out.println(contains(list, "1"));
    }

    public static boolean contains(ArrayList<User> list, String id){
        return Findindex(list, id) >= 0;
    }

    public static int Findindex(ArrayList<User> list, String id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
}
