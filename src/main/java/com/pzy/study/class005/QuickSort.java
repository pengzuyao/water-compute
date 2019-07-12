package com.pzy.study.class005;

import java.util.Arrays;

/**
 * @Description:
 * @Author: pengzuyao
 * @Time: 2019/07/12
 */
public class QuickSort {

    public static void sort(Integer[] num , int left , int right){
        Integer base = num[left];
        int ll = left;
        int rr = right;
        while (ll < rr){
            while (ll < rr && base < num[rr]){
                rr --;
            }
            if (ll < rr){
                num[ll] += num[rr];
                num[rr] = num[ll] - num[rr];
                num[ll] = num[ll] - num[rr];
                ll++;
            }
            while (ll < rr && base > num[ll]){
                ll++;
            }
            if (ll < rr){
                num[ll] += num[rr];
                num[rr] = num[ll] - num[rr];
                num[ll] = num[ll] - num[rr];
                rr--;
            }
        }
        if (left < ll){
            sort(num , left , ll);
        }
        if (rr < right){
            sort(num , ll+1 , right);
        }
    }

    public static void main(String[] args) {
        Integer[] num = new Integer[]{3 ,6 ,5 ,4 ,2};
        sort(num , 0 , num.length-1);
        System.out.println(Arrays.toString(num));
    }
}
