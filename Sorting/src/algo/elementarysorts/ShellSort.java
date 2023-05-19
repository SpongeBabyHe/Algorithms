package algo.elementarysorts;

import algo.AbstractSort;

public class ShellSort extends AbstractSort {
    public static void sort(Comparable[] a) {
        int N = a.length;
        //外层循环控制分组子序列，递增量设置为2
        for (int h = N/2; h > 0; h /= 2) {
            //内层循环为InsertionSort，j--变成j -= h
            for (int i = 0; i < N - h; i++) {
                for (int j = i; j >= 0; j -= h) {
                    if (less(a[j + h], a[j])) {
                        exch(a, j, j + h);
                    }
                }
            }
        }
    }
}
