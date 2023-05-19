package com.jenny.queue.impl;

public class ResizingArrayQueueOfString {
    private String[] a;//队列的底层数据结构为一个字符串数组，长度为a.length
    private int n;//队列中的元素个数

    /**
     * 有参构造器，创建一个容量为capacity的字符串数组a[capacity]
     *
     * @param capacity
     */
    public ResizingArrayQueueOfString(int capacity) {
        a = new String[capacity];
    }

    /**
     * 同stack一样，为了让底层数组不那么频繁地调整大小，一般使用2倍的元素长度作为数组容量的常态
     * 因此，当入队元素个数n增加到接近capacity时，数组扩容2倍；
     * 当出队元素个数n减少到接近1/4capacity时，数组减容1/2。
     */
    private void resizing() {
        if (n == a.length) {
            String[] temp = new String[2 * a.length];
            for (int i = 0; i < n; i++) {
                temp[i] = a[i];
                a = temp;
            }
        }
        if(n == 1/4 * a.length){
            String[] temp = new String[1/2 * a.length];
            for (int i = 0; i < n; i++) {
                temp[i] = a[i];
            }
            a = temp;
        }

    }

    public void enqueue(String element) {
        if(size() == a.length){
            resizing();
        }
        a[n] = element;
        n++;
    }

    public String dequeue() {
        if(size() == 1/4 * a.length){
            resizing();
        }
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
