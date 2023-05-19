package collection;

import java.util.Iterator;

public interface Collection<T> extends Iterable<T> {
    boolean isEmpty();

    int size();

    void add(T item);

    void addAll(Collection<? extends T> items);

    @Override
    Iterator<T> iterator();
}
