package queue.impl;

import queue.Queue;

import java.util.Iterator;


public class LinkedLIstQueue<T> implements Queue<T> {
    private int size;
    private Node<T> first;
    private Node<T> last;

    private class Node<T> {
        private T item;
        private Node next;

        public Node() {
        }
    }

    @Override
    public void enqueue(T item) {
        Node oldLast = last;
        last = new Node<>();
        last.item = item;
        oldLast.next = last;
        size++;
    }

    @Override
    public T dequeue() {
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
            T temp = current.item;
            current = current.next;
            return temp;
        }
    }
}
