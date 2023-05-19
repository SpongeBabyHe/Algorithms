package com.jenny.test;

import org.w3c.dom.Node;

public class TestNode {
    public static void main(String[] args) {
        class Node<T> {//嵌套类
            T t;
            Node next;

            public Node() {
            }
        }

        Node first = new Node();
        Node second = new Node();
        Node third = new Node();

        first.t = "to";
        second = first.next;
        second.t = "be";
        third = second.next;
        third.t = "or";

        Node oldfirst = first;
        first = new Node<>();
        first.t = "not";
        first.next = oldfirst;

        first = first.next;

        Node oldlast = third;
        third = new Node<>();
        third = oldlast.next ;
        third.t = "to";



    }
}
