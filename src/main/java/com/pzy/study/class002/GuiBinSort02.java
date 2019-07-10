package com.pzy.study.class002;

import java.util.Arrays;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-09
 */
public class GuiBinSort02 {

    public static void sort(Integer[] num , int left , int right){
        if (left < right){
            int mid = (left + right)/2;
            sort(num , left , mid);
            sort(num , mid+1 ,right);
            merge(num ,left ,mid ,right);
        }
    }

    public static void merge(Integer[] num , int left ,int mid ,int right){
        Integer[] temp = new Integer[num.length];
        int ll = left;
        int point1 = left;
        int point2 = mid+1;
        while (point1 <= mid && point2 <= right){
            if (num[point1] < num[point2]){
                temp[ll] = num[point1];
                ll++;
                point1++;
            }else {
                temp[ll] = num[point2];
                ll++;
                point2++;
            }
        }
        while (point1 <= mid){
            temp[ll++] = num[point1++];
        }
        while (point2 <= right){
            temp[ll++] = num[point2++];
        }
        for (int i = left; i <= right ; i++) {
            num[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        Integer[] num = new Integer[]{3 ,4 ,6 ,2 ,5};
        sort(num , 0 , num.length -1);
        System.out.println(Arrays.toString(num));
    }
}
