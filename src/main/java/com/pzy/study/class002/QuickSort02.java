package com.pzy.study.class002;

import java.util.Arrays;

/**
 * Destription:
 * Author: pengzuyao
 * Time: 2019-07-09
 */
public class QuickSort02 {


    public static void sort(Integer[] num , int left , int right){
        int ll = left;
        int rr = right;
        int base = num[left];
        while (ll < rr){
            while (ll < rr && base > num[rr]){
                rr--;
            }
            if (ll < rr){
                num[ll] += num[rr];
                num[rr] = num[ll] - num[rr];
                num[ll] = num[ll] - num[rr];
                ll++;
            }
            while (ll < rr && base < num[ll]){
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
            sort(num , left ,ll);
        }
        if (rr < right){
            sort(num , ll+1 ,right);
        }
    }

    public static void main(String[] args) {
        Integer[] num = new Integer[]{3 ,4 ,6 ,2 ,5};
        sort(num , 0 , num.length -1);
        System.out.println(Arrays.toString(num));
    }
}
