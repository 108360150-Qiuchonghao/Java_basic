package com.itheima.a02demo2;

public class demo2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4 , 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[10];
        System.arraycopy(arr1, 0, arr2, 4, 6);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
