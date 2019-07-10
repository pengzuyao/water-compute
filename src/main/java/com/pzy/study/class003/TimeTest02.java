package com.pzy.study.class003;

import javax.xml.transform.Source;

/**
 * Destription:最好情况时间复杂度、最坏情况时间复杂度、平均情况时间复杂度、均摊时间复杂度
 * Author: pengzuyao
 * Time: 2019-07-10
 */
public class TimeTest02 {

    /**
     * (2+2n)*O
     * @param array
     * @param n
     * @param x
     * @return
     */
    //n表示数组array的长度
    int find1(int[] array , int n ,int x){
        int i = 0 ;
        int pos = -1;
        for (; i < n ; ++i){
            if (array[i] == x ) pos = i;
        }
        return pos;
    }

    /**
     * 时间复杂度：最好情况下O(1);最坏情况下O(n);平均情况下
     * @param array
     * @param n
     * @param x
     * @return
     */
    int find2(int[] array , int n ,int x){
        int i = 0 ;
        int pos = -1;
        for (; i < n ; ++i){
            if (array[i] == x ){
                pos = i;
                break;
            }
        }
        return pos;
    }

    void insert(int n , int val){
        int[] array = new int[n];
        int count = 0;
        if (count == array.length){
            int sum = 0;
            for (int i = 0; i<array.length;++i){
                sum = sum +array[i];
            }
            array[0] = sum;
            count =1;
        }
        array[count] = val;
        ++count;
    }

    
}
