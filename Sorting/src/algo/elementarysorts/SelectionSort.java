package algo.elementarysorts;

import algo.AbstractSort;

public class SelectionSort extends AbstractSort {
    /**
     * 从小到大升序
     * @param a
     */
    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            if (min != i) {
                exch(a, i, min);
            }
        }
    }

}
