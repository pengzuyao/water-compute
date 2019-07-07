package com.pzy.study.Class001;

import java.awt.*;
import java.util.Arrays;

/**
 * Destription:归并排序
 * Author: pengzuyao
 * Time: 2019-07-07
 */
public class GuiBinSort {

    public static void sort(Integer[] num , int left ,int right){
        if (left < right){
            int mid = (left + right)/2;
            sort(num , left , mid);
            sort(num ,mid+1 , right);
            mergeSort(num ,left ,mid ,right);
        }

    }

    public static void mergeSort(Integer[] num , int left , int mid , int right){
            Integer[] arr = new Integer[num.length];
            int temp = left;
            int point1 = left;
            int point2 = mid+1;
            while (point1 <= mid && point2 <= right){
                if (num[point1] <= num[point2]) {
                    arr[temp] = num[point1];
                    temp++;
                    point1++;
                }else {
                    arr[temp] = num[point2];
                    temp++;
                    point2++;
                }
            }
            while (point1 <= mid){
                arr[temp++] = num[point1++];
            }
            while (point2 <= right){
                arr[temp++] = num[point2++];
            }

            for (int i = left; i <=right; i++) {
                num[i] = arr[i];
            }
    }


    public static void main(String[] args) {
        Integer[] num = new Integer[]{3 , 6 ,5 ,2 ,4};
        sort(num , 0 , num.length-1);
        System.out.println(Arrays.toString(num));
    }
}
