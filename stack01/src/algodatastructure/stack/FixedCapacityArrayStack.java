package algodatastructure.stack;

public class FixedCapacityArrayStack<T> extends AbstractArrayStack<T> {
    public FixedCapacityArrayStack() {
        super();
    }

    public FixedCapacityArrayStack(final int capacity) {
        super(capacity);
    }

    public void push(final T entry) {
        entries[size++] = entry;
    }

    public T pop() {
        if (this.isEmpty()) return null;
        final T entry = entries[--size];
        entries[size] = null; // VERY IMPORTANT
        return entry;
    }

    // This is bad due to loitering
    @Deprecated
    public T popOld() {
        return this.entries[--this.size];
    }

    public static void main(final String[] args) {
        final FixedCapacityArrayStack<Integer> testStack = new FixedCapacityArrayStack<>(4);
        System.out.println("is empty: " + testStack.isEmpty());
        System.out.println("is full: " + testStack.isFull());

        testStack.push(1);
        testStack.push(3);
        testStack.push(5);
        testStack.push(0);
        System.out.println("is empty: " + testStack.isEmpty());
        System.out.println("is full: " + testStack.isFull());
        System.out.println("size: " + testStack.getSize());
        System.out.println("");

        for (final Integer entry : testStack) {
            System.out.println(entry);
        }
    }
}
