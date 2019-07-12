package com.pzy.study.class004;

/**
 * @Description: 用数组实现的队列
 * @Author: pengzuyao
 * @Time: 2019/07/11
 */
public class ArrayTest002 {

    /**
     * 数组items ,数组大小n
     */

    private String[] items;
    private int n = 0;
    /**
     * head 表示对头下标，tail表示队尾下标
     */
    private int head = 0;
    private int tail = 0;

    /**
     * 申请一个大小为 capacity 的数组
     */
    public ArrayTest002(int capacity){
        items = new String[capacity];
        n = capacity;
    }

    /**
     * 入队
     */
    public boolean enqueue(String item){
        //如果tail == n 表示队列已经满了
        if (tail == n) {
            return false;
        }
        items[tail] = item;
        ++tail;
        return true;
    }

    /**
     * 出队
     */
    public String dequeue(){
        //如果head == tail 表示队列为空
        if (head == tail){
            return null;
        }
        String ret = items[head];
        ++head;
        return ret;
    }

    /**
     * 数据搬迁
     * @return
     */
    public boolean enqueue2(String item){
        //tail == n 表示队列末尾没有空间了
        if (tail == n){
            //tail== n && head ==0 ,表示整个队列都占满了
            if (head == 0){
                return false;
            }
            //数据搬迁
            for (int i = head; i < tail; i++) {
                items[i - head] = items[i];
            }
            //搬迁完之后重新更新 head 和 tail
            tail -= head;
            head = 0;
        }
        items[tail] = item;
        ++tail;
        return true;
    }


    public class CircularQueue{
        //数组：items ,数组大小:n
        private String[] items;
        private int n = 0;
        //head 表示队头下标，tail表示队尾下标
        private int head = 0;
        private int tail = 0;
        //申请一个大小为capacity 的数组
        public CircularQueue(int capacity){
            items = new String[capacity];
            n = capacity;
        }

        //入队
        public boolean enqueue(String item){
            //队列满了
            if ((tail + 1) % n == head){
                return false;
            }
            items[tail] = item;
            tail = (tail + 1) % n;
            return true;
        }

        public String dequeue(){
            if (head == tail){
                return null;
            }
            String ret = items[head];
            ++head;
            return ret;
        }

    }
}
