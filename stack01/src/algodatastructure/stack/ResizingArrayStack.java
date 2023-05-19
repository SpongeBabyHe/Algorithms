package algodatastructure.stack;

// alternatively we can also extends from FixedCapacityArrayStack, see ResizingArrayStackAlt
public class ResizingArrayStack<T> extends AbstractArrayStack<T> {
    public ResizingArrayStack() {
        super();
    }

    public ResizingArrayStack(int initialCapacity) {
        super(initialCapacity);
    }

    @Override
    public void push(T entry) {
        if (isFull()) {
            resize(entries.length * 2);
        }
        entries[size++] = entry;
    }

    // Implementation Note: when size == 0, capacity could be 1 or 2
    // marginal case: length=1, size=1, length/2=0. the invariant is length/2>0
    // so length=1 requires further inspection, that's why we added && size > 0
    @Override
    public T pop() {
        if (isEmpty()) return null;
        T entry = entries[--size];
        // size <= entries.length / 4 is bad when there is only entry
        // alternatively : size < entries.length / 4
        if (getSize() == entries.length / 4 && getSize() > 0) {
            resize(entries.length / 2);
        } else {
            entries[size] = null; // avoid loitering
        }
        return entry;
    }

    @SuppressWarnings("unchecked")
    // we can choose to whether reorder the entries in the internal array
    protected void resize(int newCapacity) {
        T[] resizedArray = (T[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            resizedArray[i] = entries[i];
        }
        entries = resizedArray;
    }

    public static void main(String[] args) {
        final int initialCapacity = 4;
        final ResizingArrayStack<Integer> testStack = new ResizingArrayStack<>(initialCapacity);

        for (int i = 1; i <= initialCapacity; i++) {
            testStack.push(i);
        }

        for (Integer entry : testStack) {
            System.out.println(entry);
        }

        System.out.println("size: " + testStack.getSize());
        System.out.println("capacity: " + testStack.getCapacity());
        System.out.println("");


        for (int i = initialCapacity + 1; i <= initialCapacity * 2; i++) {
            testStack.push(i);
        }

        for (Integer entry : testStack) {
            System.out.println(entry);
        }

        System.out.println("size: " + testStack.getSize());
        System.out.println("capacity: " + testStack.getCapacity());
        System.out.println("");

        for (int i = 1; i <= initialCapacity; i++) {
            testStack.pop();
        }

        for (Integer entry : testStack) {
            System.out.println(entry);
        }

        System.out.println("size: " + testStack.getSize());
        System.out.println("capacity: " + testStack.getCapacity());
        System.out.println("");

        for (int i = 1; i <= initialCapacity; i++) {
            testStack.pop();
        }

        for (Integer entry : testStack) {
            System.out.println(entry);
        }

        System.out.println("size: " + testStack.getSize());
        System.out.println("capacity: " + testStack.getCapacity());
        System.out.println("");
    }
}
