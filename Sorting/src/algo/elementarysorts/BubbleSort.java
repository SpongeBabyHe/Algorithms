package algo.elementarysorts;

import algo.AbstractSort;

public class BubbleSort extends AbstractSort {
    public static void sort(Comparable[] a) {
        //外层循环控制轮数a.length-1
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (less(a[j + 1], a[j])) {
                    exch(a, j + 1, j);
                }
            }
        }
    }
}
