package com.pzy.study.Class001;

import java.util.Arrays;

/**
 * Destription:冒泡排序
 * Author: pengzuyao
 * Time: 2019-07-07
 */
public class MaoPaoSort {

    public static void sort(Integer[] num){
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length -i-1; j++) {
                if (num[j] < num[j+1] ){
                    num[j] = num[j] + num[j+1];
                    num[j+1] = num[j] - num[j+1];
                    num[j] = num[j] - num[j+1];
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
