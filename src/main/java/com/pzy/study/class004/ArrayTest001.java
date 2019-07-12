package com.pzy.study.class004;

/**
 * @Description: 在数组a中，查找key,返回key所在位置
 * @Author: pengzuyao
 * @Time: 2019/07/11
 */
public class ArrayTest001 {

    int find1(char[] a ,int n , char key){
        if (a == null || n <= 0){
            return -1;
        }
        int i = 0;
        while (i < n){
            if (a[i] == key){
                return i;
            }
            ++i;
        }
        return -1;
    }




    int find2(char[] a , int n , char key){
        if (a == null || n <= 0){
            return -1;
        }
        if (a[n-1] == key){
            return n-1;
        }
        char tmp = a[n-1];
        a[n-1] = key;
        int i = 0;
        while (a[i] != key){
            ++i;
        }
        a[n-1] = tmp;
        if (i == n-1){
            return -1;
        }else {
            return i;
        }
    }
}
