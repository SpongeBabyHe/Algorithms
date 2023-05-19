package algodatastructure.stack;

import algodatastructure.collection.Collection;

public interface Stack<T> extends Collection<T> {
    default void add(T entry) {
        push(entry);
    }

    void push(T entry);

    T pop();

    T peek();
}
