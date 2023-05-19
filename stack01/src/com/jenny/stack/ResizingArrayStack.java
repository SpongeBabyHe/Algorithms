/*
package com.jenny.stack;

import java.util.Iterator;

public class ResizingArrayStack<T> extends AbstractArrayStack<T> {
    private T[] s; //字符串数组-->T类型数组
    private int n;//元素的数量，区别数组的长度

    public ResizingArrayStack(int cap) { //构造器底层实际是创造一个cap容量的数组
        s = (T[]) new Object[cap];
    }

    void push(T item) {//压栈，item存入s[n]
        if (s.length == n) {
            this.resize(s.length * 2);
        }
        s[n++] = item;//[]运算优先级高于++，--
    }

    T pop() {//弹栈，数组最后元素s[n-1]弹出
        T t = null;
        if (n > 0) {
            t = s[--n];
            s[n] = null;//避免对象游离
            if (n == s.length / 4) {
                this.resize(s.length / 2);
            }
        }
        return t;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    */
/**
     * 调整数组长度
     *
     * @param max
     *//*

    private void resize(int max) {
        T[] temp = (T[]) new Object[max];
        for (int i = 0; i < s.length; i++) {
            temp[i] = s[i];
        }
        s = temp;
    }


    @Override
    public Iterator<T> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<T> {

        private int temp = n;

        @Override
        public boolean hasNext() {
            return temp > 0;
        }

        @Override
        public T next() {
            return s[--temp];
        }//--n会改变元素个数，使用一个temp

        @Override
        public void remove() {
        }
    }
}
*/
