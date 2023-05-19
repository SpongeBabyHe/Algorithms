package com.jenny.deque.impl;

public class ResizingArrayDeque<T> {

    private T[] a;
    private int n;

    public ResizingArrayDeque(int capacity) {
        a = (T[]) new Object[capacity];
    }

    private void resize() {
        if (n == a.length) {
            T[] temp = (T[]) new Object[2 * a.length];
            for (int i = 0; i < n; i++) {
                temp[i] = a[i];
                a = temp;
            }
        }
        if (n == 1 / 4 * a.length) {
            T[] temp = (T[]) new Object[1 / 2 * a.length];
            for (int i = 0; i < n; i++) {
                temp[i] = a[i];
            }
            a = temp;
        }
    }

    void pushLeft(T t) {
        a[n] = t;
        n++;
        if (size() == a.length) {
            resize();
        }
    }

    void pushRight(T t) {
        T temp = a[n - 1];
        for (int i = n - 1; i > 0; i++) {
            a[i] = a[i - 1];
        }
        a[0] = t;
        n++;
        if (size() == a.length) {
            resize();
        }
    }

    T popLeft() {
        T t = a[n];
        a[n] = null;//避免对象游离
        n--;
        if (n > 0 && n == a.length / 4) {
            this.resize();
        }
        return t;

    }

    T popRight() {
        T temp = a[0];
        for (int i = 0; i < n; i++) {
            a[i] = a[i + 1];
        }
        n--;
        if (size() == 1 / 4 * a.length) {
            resize();
        }
        return temp;

    }

    public Boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }
}
