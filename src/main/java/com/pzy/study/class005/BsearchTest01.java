package com.pzy.study.class005;

/**
 * @Description: 二分查找必须针对有序数组
 * @Author: pengzuyao
 * @Time: 2019/07/12
 */
public class BsearchTest01 {

    public int bsearch(int[] a , int n ,int value){
        int low = 0;
        int high = n-1;
        while (low <= high){
            int mid = low + ((high - low)>>1);
            if (a[mid] >= value){
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        if (low < n && a[low] == value) {
            return low;
        }else {
            return -1;
        }
    }
}
