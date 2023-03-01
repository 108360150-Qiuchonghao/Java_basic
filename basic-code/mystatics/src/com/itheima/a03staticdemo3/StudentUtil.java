package com.itheima.a03staticdemo3;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil(){}

    public static int getMaxAge(ArrayList<Student> list){
        int maxage = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAge()>maxage)
                maxage = list.get(i).getAge();
        }
        return maxage;
    }
}
