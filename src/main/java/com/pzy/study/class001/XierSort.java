package com.pzy.study.class001;

import java.util.Arrays;

/**
 * Destription:希尔排序
 * Author: pengzuyao
 * Time: 2019-07-07
 */
public class XierSort {


    public static void sort(Integer[] num){
        int step = num.length/2;
        while (step != 0){
            for (int i = step; i < num.length; i++) {
                for (int j = i; j - step >= 0; j-=step) {
                    if (num[j] > num[j-step]){
                        num[j] = num[j] + num[j-step];
                        num[j-step] = num[j] - num[j-step];
                        num[j] = num[j] - num[j-step];
                    }else {
                        break;
                    }
                }
            }
            step = step/2;
        }
    }

    public static void main(String[] args) {
        Integer[] num = new Integer[]{3 , 6 ,5 ,2 ,4};
        sort(num);
        System.out.println(Arrays.toString(num));
    }
}
