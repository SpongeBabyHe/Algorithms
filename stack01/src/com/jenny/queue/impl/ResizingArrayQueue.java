/*
package com.jenny.queue.impl;

import java.util.Iterator;

public class ResizingArrayQueue<T> extends AbstractArrayQueue<T>{
    private T[] a;//队列的底层数据结构为一个字符串数组，长度为a.length
    private int n;//队列中的元素个数

    */
/**
     * 有参构造器，创建一个容量为capacity的字符串数组a[capacity]
     *
     * @param capacity
     *//*

    public ResizingArrayQueue(int capacity) {
        a = (T[]) new Object[capacity];
    }

    */
/**
     * 同stack一样，为了让底层数组不那么频繁地调整大小，一般使用2倍的元素长度作为数组容量的常态
     * 因此，当入队元素个数n增加到接近capacity时，数组扩容2倍；
     * 当出队元素个数n减少到接近1/4capacity时，数组减容1/2。
     *//*

    private void resize() {
        if (n == a.length) {
            T[] temp = (T[]) new Object[2 * a.length];
            for (int i = 0; i < n; i++) {
                temp[i] = a[i];
                a = temp;
            }
        }
        if(n == 1/4 * a.length){
            T[] temp = (T[]) new Object[1/2 * a.length];
            for (int i = 0; i < n; i++) {
                temp[i] = a[i];
            }
            a = temp;
        }

    }

    public void enqueue(T t) {
        a[n] = t;
        n++;
        if(size() == a.length){
            resize();
        }
    }

    public T dequeue() {
        T temp = a[0];
        for (int i = 0; i < n; i++) {
            a[i] = a[i + 1];
        }
        n--;
        if(size() == 1/4 * a.length){
            resize();
        }
        return temp;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
*/
