package com.pzy.study.class003;

/** 复杂度分析目的：如何更快时间、更省空间的解决问题
 * Destription: 时间复杂度：所有代码的执行时间T(n)与每行代码的执行次数成正比T(n) = O(f(n))
 * Author: pengzuyao
 * Time: 2019-07-10
 */
public class TimeTest {

    /**
     * 时间复杂度：(1+1+2*n)*O
     * @param n
     * @return
     */
    int cal1(int n){
        int sum = 0;
        int i = 1;
        for (; i <= n ; ++i) {
            sum = sum +i;
        }
        return sum;
    }

    /**
     * (1+1+1+2n+2n^2)*O
     * @param n
     * @return
     */
    int cal2(int n){
        int sum = 0;
        int i = 1;
        int j = 1;
        for (; i <= n ; ++i) {
            j = 1;
            for (; j <= n ; ++j) {
                sum = sum + i*j;
            }
        }
        return sum;
    }

    /**
     * (2+2n+2+2n+3+4n^2)*O
     * @param n
     * @return
     */
    int cal3(int n){
        int sum_1 = 0;
        int p = 1;
        for (; p < 100; ++p){
            sum_1 = sum_1 + p;
        }
        int sum_2 = 0;
        int q = 1;
        for (; q < n; ++q){
            sum_2 = sum_2 + q;
        }
        int sum_3 = 0;
        int i = 1;
        int j = 1;
        for (; i <= n ; ++i) {
            j = 1;
            for (; j <= n; ++j){
                sum_3 = sum_3 +i*j;
            }
        }
        return sum_1 + sum_2 + sum_3;
    }

    /**
     * i*2 = n --> i =log2n
     * @param n
     */
    void cal4(int n){
        int i = 1;
        while (i <= n){
            i = i * 2;
        }
    }


    /**
     * 复杂度量级(按数量级递增)
     * 多项式量级：常量级O(1)、对数级O(logn)、线性级O(n)、线性对数级O(nlogn)、平方阶O(n^2)、立方阶O(n^3)、k次方阶O(n^k)
     * 非多项式量级：O(2^n)、O(n!)
     */


}
