package algodatastructure.stack;

public class ResizingArrayStackAlt<T> extends FixedCapacityArrayStack<T> {
    public ResizingArrayStackAlt() {
        super();
    }

    public ResizingArrayStackAlt(int initialCapacity) {
        super(initialCapacity);
    }

    @Override
    public void push(T entry) {
        if (isFull()) resize(entries.length * 2);
        super.push(entry);
    }

    @Override
    public T pop() {
        T entry = super.pop();
        if (getSize() == entries.length / 4 && getSize() > 0) resize(entries.length / 2);
        return entry;
    }

    @SuppressWarnings("unchecked")
    // we can choose to whether reorder the entries in the interal array
    protected void resize(int newCapacity) {
        T[] resizedArray = (T[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) resizedArray[i] = entries[i];
        entries = resizedArray;
    }

    public static void main(String[] args) {
        final int initialCapacity = 4;
        final ResizingArrayStackAlt<Integer> testStack = new ResizingArrayStackAlt<>(initialCapacity);

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
