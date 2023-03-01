package com.itheima.a02staticdemo2;

public class ArrayUtil {
    private ArrayUtil(){}

    public static String printArr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if( i == arr.length-1){
                sb.append(arr[i]).append("]");
            }else{
                sb.append(arr[i]).append(", ");
            }
        }
        return sb.toString();
    }

    public static double getAve(double[] arr) {
        double sum = 0;
        for (double v : arr) {
            sum += v;
        }
        return sum/arr.length;
    }

}
