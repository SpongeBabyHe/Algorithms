package queue.impl;

import queue.AbstractArrayQueue;

public class FixedCapacityArrayQueue<T> extends AbstractArrayQueue<T> {
    @Override
    public void enqueue(T item) {
        arr[size] = item;
        size++;
    }

    @Override
    public T dequeue() {
        T temp = arr[0];
        for (int i = 0; i < size; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        return temp;
    }
}
