package com.jenny.stack;

import java.util.Iterator;

public class FixedCapacityStack<T> extends AbstractArrayStack<T> {
    /*private T[] s; //字符串数组-->T类型数组
    private int n;//元素的数量，区别数组的长度

    public FixedCapacityStack(int cap) { //构造器底层实际是创造一个cap容量的数组
        s = (T[]) new Object[cap];
    }

    @Override
    void push(T item) {
        s[n++] = item;//[]运算优先级高于++，--
    }

    T pop() {//弹栈，数组最后元素s[n-1]弹出
        T temp = s[n-1];
        s[n] = null;
        n--;
        return temp;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }*/



}
