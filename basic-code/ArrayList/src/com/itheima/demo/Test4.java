package com.itheima.demo;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("Harry", 20);
        Student s2 = new Student("Harry2", 21);
        Student s3 = new Student("Harry3", 22);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + "," + stu.getAge() );
        }

    }
}
