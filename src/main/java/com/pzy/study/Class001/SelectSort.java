package com.pzy.study.Class001;

import java.util.Arrays;

/**
 * Destription: 选择排序
 * Author: pengzuyao
 * Time: 2019-07-07
 */
public class SelectSort {

    public static void sort(Integer[] num){
        for (int i = 0; i < num.length-1; i++) {
            for (int j = i+1; j < num.length; j++) {
                if (num[i] < num[j]){
                    num[i] = num[i] + num[j];
                    num[j] = num[i] - num[j];
                    num[i] = num[i] - num[j];
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] num = new Integer[]{3 , 6 ,5 ,4 ,2};
        sort(num);
        System.out.println(Arrays.toString(num));
    }
}
