package com.jenny.queue.impl;

import java.util.Iterator;

public class LinkedListQueue<T> implements Iterable<T> {

    private Node first;
    private Node last;
    private int n;

    private class Node {
        T item;
        Node next;

        public Node() {
        }
    }

    public LinkedListQueue() {
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    void enqueue(T t) {
        if (n == 0) {
            last = new Node();
            last.item = t;
            first = last;
        } else {
            Node newLast = new Node();
            newLast = last.next;
            newLast.item = t;
            last = newLast;
        }
        n++;
    }

    T dequeue() {
        if (n == 0) {
            return null;
        } else {
            T t = first.item;
            first = first.next;
            n--;
            return t;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T> {

        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T t = current.item;
            current = current.next;
            return t;
        }

        @Override
        public void remove() {

        }
    }


}
