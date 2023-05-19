package stack.impl;

import stack.Stack;

import java.util.Iterator;

public class LinkedListStack<T> implements Stack<T> {
    private int size;
    private Node<T> first;

    private class Node<T> {
        private T item;
        private Node next;

        public Node() {
        }
    }

    @Override
    public void push(T item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        size++;
    }

    @Override
    public T pop() {
        if (size == 0) {
            return null;
        } else {
            T t = first.item;
            first = first.next;
            size--;
            return t;
        }
    }

    @Override
    public T peek() {
        return isEmpty() ? null : first.item;
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
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T> {
        private Node<T> current = first;

        @Override
        public boolean hasNext() {
            return current.next != null;
        }

        @Override
        public T next() {
            T item = current.item;
            current = current.next;
            return item;
        }
    }
}
