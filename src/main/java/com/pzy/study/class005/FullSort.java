package com.pzy.study.class005;

import java.util.Arrays;

/**
 * @Description:
 * @Author: pengzuyao
 * @Time: 2019/07/12
 */
public class FullSort {

    static int count =0;

    public static void sort(String[] str , int start , int len){
        if (start == len){
            System.out.println(Arrays.toString(str));
            ++count;
        }else {
            for (int i = start; i <= len; i++) {
                swap(str , start , i);
                sort(str , start+1 , len);
                swap(str , start , i);
            }
        }
    }

    public static void swap(String[] str , int left , int right){
        String temp = str[left];
        str[left] = str[right];
        str[right] = temp;
    }

    public static void main(String[] args) {
            String[] str = new String[]{"a" , "b" , "c" , "d" ,"e" , "f"};
            sort(str , 0 , str.length -1);
            System.out.println(count);
    }
}
