/*
package com.jenny.queue.impl;

import com.jenny.stack.ResizingArrayStack;

import java.util.Iterator;

public class FixedCapacityQueue<T> extends AbstractArrayQueue<T>{

    private T[] a;//队列的底层数据结构为一个泛型数组
    private int n;//队列中的元素个数

    */
/**
     * 有参构造器，创建一个容量为capacity的泛型数组a[capacity]
     *
     * @param capacity
     *//*

    public FixedCapacityQueue(int capacity) {
        a = (T[]) new Object[capacity];
    }

    public void enqueue(T t) {
        a[n] = t;
        n++;
    }

    public T dequeue() {
        T temp = a[0];
        for (int i = 0; i < n; i++) {
            a[i] = a[i + 1];
        }
        n--;
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
        return new ArrayIterator();
    }

    */
/**
     * stack是逆序迭代，queue正序
     * @param <T>
     *//*

    private class ArrayIterator<T> implements Iterator<T> {

        private int temp = 0;

        @Override
        public boolean hasNext() {
            return temp <= n;
        }

        @Override
        public T next() {
            return (T) a[temp++];
        }
    }
}
*/
