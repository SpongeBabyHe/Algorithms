package queue.impl;

import queue.AbstractArrayQueue;

public class ResizingArrayQueue<T> extends AbstractArrayQueue<T> {
    @Override
    public void enqueue(T item) {
        arr[size] = item;
        size++;
        if (size == arr.length) {
            resize(2 * arr.length);
        }
    }

    @Override
    public T dequeue() {
        T temp = arr[0];
        size--;
        if (size == arr.length / 4) {
            resize(arr.length / 2);
        }
        return temp;
    }

    public void resize(int length) {
        T[] temp = (T[]) new Object[length];
        if(size == arr.length) {
            for (int i = 0; i < size; i++) {
                temp[i] = arr[i];
            }
        }else{
            for (int i = 0; i < size; i++) {
                temp[i] = arr[i + 1];
            }
        }
        arr = temp;
    }
}
