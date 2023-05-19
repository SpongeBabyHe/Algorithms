package stack;

import java.util.Iterator;

public abstract class AbstractArrayStack<T> implements Stack<T> {
    protected T[] arr;
    protected int size;

    public AbstractArrayStack() {
    }

    public AbstractArrayStack(int initialCapacity) {
        arr = (T[]) new Object[initialCapacity];
    }


    @Override
    public T peek() {
        return this.isEmpty() ? null : arr[size - 1];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }
    public Iterator<T> iterator() {
        return new ReverseArrayIterator();
    }
    private class ReverseArrayIterator implements Iterator{
        private int temp = size;

        @Override
        public boolean hasNext() {
            return temp > 0;
        }

        @Override
        public Object next() {
            return arr[--temp];
        }
    }
}
