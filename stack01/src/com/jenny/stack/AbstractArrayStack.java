package com.jenny.stack;

import com.jenny.collection.Collection;

import java.util.Iterator;

public abstract class AbstractArrayStack<T> implements Stack<T>{
    private T[] s;
    private int n;

    public AbstractArrayStack(int initialCapacity) {
        s = (T[]) new Object[initialCapacity];
    }

    public AbstractArrayStack() {
    }

    @Override
    public void push(T item) {
        s[n++] = item;
    }

    @Override
    public T pop() {
        T temp = s[n-1];
        s[n] = null;
        n--;
        return temp;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public void addAll(Collection<? extends T> c) {

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
            return (T) s[--temp];
        }//--n会改变元素个数，使用一个temp
    }
}
