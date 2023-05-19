package algodatastructure.stack;

import java.util.Iterator;

public abstract class AbstractArrayStack<T> implements Stack<T> {
    protected T[] entries;

    // is protected a good idea?
    protected int size; // size also acts as the next index used to insert a new entry

    @SuppressWarnings("unchecked")
    public AbstractArrayStack() {
        entries = (T[]) new Object[1]; // what is the proper initial capacity
        size = 0;
    }

    @SuppressWarnings("unchecked")
    public AbstractArrayStack(int initialCapacity) {
        entries = (T[]) new Object[Math.max(initialCapacity, 1)]; // 0 is not allowed
        size = 0;
    }

    public T peek() {
        return isEmpty() ? null : entries[size - 1];
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == entries.length;
    }

    public int getCapacity() {
        return entries.length;
    }

    public Iterator<T> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<T> {
        private int cursor = size;

        @Override
        public boolean hasNext() {
            return cursor > 0;
        }

        @Override
        public T next() {
            return entries[--cursor];
        }
    }
}
