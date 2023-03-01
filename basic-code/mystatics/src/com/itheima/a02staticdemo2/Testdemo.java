package com.itheima.a02staticdemo2;

public class Testdemo {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        String str = ArrayUtil.printArr(array);
        System.out.println(str);

        double[] array2 = {1, 2, 3, 4, 5};
        double ave = ArrayUtil.getAve(array2);
        System.out.println(ave);
    }
}
