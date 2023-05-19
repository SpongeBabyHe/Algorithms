package com.jenny.collection;

import java.util.Iterator;

//temporary APIs
public interface Collection<T> extends Iterable<T> {
    boolean isEmpty();

    int size();

    void add(T item);

    void addAll(Collection<? extends T> c);

    Iterator<T> iterator();
}
