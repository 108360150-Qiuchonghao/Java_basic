package com.itheima.a03staticdemo3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();

        Student stu1 = new Student("zhangsan","男",12);
        Student stu2 = new Student("zhang1","男",14);
        Student stu3 = new Student("zhang2","男",15);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        int maxage = StudentUtil.getMaxAge(list);
        System.out.println(maxage);



    }

}
