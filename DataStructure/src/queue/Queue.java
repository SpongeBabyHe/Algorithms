package queue;

import collection.Collection;

import java.util.Iterator;

public interface Queue<T> extends Collection<T> {
    @Override
    default void add(T item){
        enqueue(item);
    }

    void enqueue(T item);
    T dequeue();
    T peek();

    @Override
    default void addAll(Collection<? extends T> items){
        for (T item : items) {
            add(item);
        }
    }

}
