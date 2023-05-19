package com.jenny.stack;


import com.jenny.collection.Collection;

public interface Stack<T> extends Collection<T> {

    @Override
    default void add(T item){
        push(item);
    }

    void push(T item);
    T pop();
    T peek();


}
