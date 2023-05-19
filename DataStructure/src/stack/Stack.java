package stack;


import collection.Collection;

public interface Stack<T> extends Collection<T> {
    @Override
    default void add(T item){
        push(item);
    }
    void push(T item);

    T pop();
    T peek();

    @Override
    default void addAll(Collection<? extends T> items){
        for (T item : items) {
            add(item);
        }
    }
}
