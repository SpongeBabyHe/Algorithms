package algodatastructure.stack;

import java.util.Iterator;

public class PointerLinkedListStack<T> implements Stack<T> {
    protected Node head;
    protected int size;

    protected class Node {
        T item;
        Node next;
    }

    public PointerLinkedListStack() {
        head = null;
        size = 0;
    }

    public void push(T entry) {
        Node newNode = new Node();
        newNode.item = entry;
        newNode.next = head;
        head = newNode;
        size++;
    }

    public T pop() {
        if (head == null) return null;
        T entry = head.item;
        head = head.next;
        size--;
        return entry;
    }

    public T popAlt() {
        if (head == null) return null;
        T entry = head.item;
        Node oldHead = head;
        head = oldHead.next;
        oldHead.next = null; // is this necessary?
        size--;
        return entry;
    }

    public T peek() {
        return head == null ? null : head.item;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<T> {
        private Node cursor = head;

        @Override
        public boolean hasNext() {
            return cursor != null;
        }

        @Override
        public T next() {
            T entry = cursor.item;
            cursor = cursor.next;
            return entry;
        }
    }

    public static void main(String[] args) {
        PointerLinkedListStack<Integer> testStack = new PointerLinkedListStack<>();
        System.out.println(testStack.isEmpty());

        testStack.push(1);
        testStack.push(3);
        testStack.push(5);
        testStack.push(0);
        System.out.println(testStack.isEmpty());
        System.out.println(testStack.getSize());
        System.out.println("");

        for (Integer entry : testStack) {
            System.out.println(entry);
        }
    }
}
