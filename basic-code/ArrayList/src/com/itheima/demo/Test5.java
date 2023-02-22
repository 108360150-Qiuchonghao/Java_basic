package com.itheima.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<Student> list = new  ArrayList<>();


        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            Student s = new Student(); //不能放在外面，因為add的是地址
            System.out.println("please print name");
            String name = sc.next();
            System.out.println("please print age");
            int age = sc.nextInt();

            s.setName(name);
            s.setAge(age);

            list.add(s);
        }

        for (Student stu : list) {
            System.out.println(stu.getName() + "," + stu.getAge());
        }

    }
}
