package com.jenny.queue.impl;

public class FixedCapacityQueueOfString {

    private String[] a;//队列的底层数据结构为一个字符串数组
    private int n;//队列中的元素个数

    /**
     * 有参构造器，创建一个容量为capacity的字符串数组a[capacity]
     *
     * @param capacity
     */
    public FixedCapacityQueueOfString(int capacity) {
        a = new String[capacity];
    }

    /**
     * 入队排在数组最后
     *
     * @param element
     */
    public void enqueue(String element) {
        a[n] = element;
        n++;
    }

    /**
     * 出队，第一个先出
     *
     * @return
     */
    public String dequeue() {
        String temp = a[0];
        for (int i = 0; i < n; i++) {
            a[i] = a[i + 1];
        }
        n--;
        return temp;
    }

    Boolean isEmpty() {
        return n == 0;
    }

    int size() {
        return n;
    }
}
