package algodatastructure.collection;

import java.util.Iterator;

// we can augment the APIs later
// TODO implement equals() and hashCode()
public interface Collection<T> extends Iterable<T> {
    void add(T entry);

    default void addAll(Iterable<T> entries) {
        for (T entry : entries) add(entry);
    }

    int getSize();

    boolean isEmpty();

    Iterator<T> iterator();
}
