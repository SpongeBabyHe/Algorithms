package queue;

import java.util.Iterator;

public abstract class AbstractArrayQueue<T> implements Queue<T> {
    protected Integer size;
    protected T[] arr;

    public AbstractArrayQueue() {
    }

    public AbstractArrayQueue(Integer initialCapacity) {
        arr = (T[]) new Object[initialCapacity];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T peek() {
        return this.isEmpty() ? null : arr[0];
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator();
    }

    private class ArrayIterator implements Iterator<T> {
        private int temp = 0;

        @Override
        public boolean hasNext() {
            return temp < size - 1;
        }

        @Override
        public T next() {
            return arr[temp++];
        }
    }
}
