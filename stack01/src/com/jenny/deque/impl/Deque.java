package com.jenny.deque.impl;

public class Deque<T> {


    private Node right;
    private Node left;
    private int n;


    private class Node{
        private T item;
        private Node next;
        private Node previous;

        public Node(){}
    }

    public Deque(){}



    void pushLeft(T t){
        Node oldLeft = left;
        left = new Node();
        left.item = t;
        left.next = oldLeft;
        left.previous = null;
    }

    void pushRight(T t){
        Node oldRight = right;
        right = new Node();
        right.item = t;
        right.previous = oldRight;
        right.next = null;
    }

    T popLeft(){
        T temp = left.item;
        left = left.next;
        left.previous = null;
        return temp;
    }

    T popRight(){
        T temp = right.item;
        right = right.previous;
        right.next = null;
        return temp;
    }

    public Boolean isEmpty(){
        return n == 0;
    }

    public int size(){
        return n;
    }
}
