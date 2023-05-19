package stack.impl;

import stack.AbstractArrayStack;

public class ResizingArrayStack<T> extends AbstractArrayStack<T> {
    public ResizingArrayStack() {
    }

    public ResizingArrayStack(int initialCapacity) {
        super(initialCapacity);
    }

    public void resize(int resizingLength) {
        T[] temp = (T[]) new Object[resizingLength];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }

    @Override
    public void push(T item) {
        arr[size++] = item;
        if (size == arr.length) {
            resize(2 * arr.length);
        }
    }

    @Override
    public T pop() {
        T item = null;
        if (size > 0) {
            item = arr[--size];
            arr[size] = null;
            if (size == arr.length/4){
                resize(arr.length/2);
            }
        }
        return item;
    }
}
