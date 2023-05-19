/*
package com.jenny.stack;

import java.util.Iterator;

public class LinkedListStack<T> implements Stack<T> {
    private Node first;

    //private Node last;

    private int n;

    private class Node {
        T item;
        Node next;

        public Node() {
        }
    }

    public LinkedListStack() {

    }

    */
/**
     * 优化，去掉last
     *//*

    void push(T t) {
        Node oldfirst = first;
        first = new Node();
        first.item = t;
        first.next = oldfirst;
        n++;
    }
    */
/*void push(T t) {
        if (n == 0) {
            last = new Node();
            last.item = t;
            last.next = null;
            first = last;
        } else {
            Node oldfirst = first;
            first = new Node();
            first.item = t;
            first.next = oldfirst;
        }
        n++;
    }*//*


    T pop() {
        if (n == 0) {
            return null;
        } else {
            T t = first.item;
            first = first.next;
            n--;
            return t;
        }
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    @Override
    public void add(T item) {
        push(item);
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
*/
