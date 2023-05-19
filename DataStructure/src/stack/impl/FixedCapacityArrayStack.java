package stack.impl;

import stack.AbstractArrayStack;

public class FixedCapacityArrayStack<T> extends AbstractArrayStack<T> {
    public FixedCapacityArrayStack() {
    }

    public FixedCapacityArrayStack(int initialCapacity) {
        super(initialCapacity);
    }

    @Override
    public void push(T item) {
        arr[size++] = item;
    }

    @Override
    public T pop() {
        T item = arr[--size];
        arr[size]=null;
        return item;
    }
}
