package com.pzy.study.class001;

import java.util.Arrays;

/**
 * Destription: 插入排序
 * Author: pengzuyao
 * Time: 2019-07-07
 */
public class InsertSort {

    public static void sort(Integer[] num){
        for (int i = 1; i < num.length; i++) {
            for (int j = i; j > 0 ; j--) {
                if (num[j] > num[j-1]){
                    num[j] = num[j] + num[j-1];
                    num[j-1] = num[j] - num[j-1];
                    num[j] = num[j] - num[j-1];
                }
            }
        }
    }


    public static void main(String[] args) {
        Integer[] num = new Integer[]{3 , 6 ,5 ,2 ,4};
        sort(num);
        System.out.println(Arrays.toString(num));
    }
}
