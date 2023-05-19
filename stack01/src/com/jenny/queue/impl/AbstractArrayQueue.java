package com.jenny.queue.impl;



public abstract class AbstractArrayQueue<T> implements Queue<T> {

    @Override
    public void add(T item) {
        enqueue(item);
    }

    public abstract void enqueue(T item);

    public abstract T dequeue();

}
