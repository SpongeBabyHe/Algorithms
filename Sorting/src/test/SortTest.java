package test;

import algo.elementarysorts.BubbleSort;
import algo.elementarysorts.InsertionSort;
import algo.elementarysorts.SelectionSort;
import algo.elementarysorts.ShellSort;
import org.junit.Test;

public class SortTest {

    @Test
    public void testSelectionSort(){
        Integer[] a = {24, 56, 2, 4, 90, 1};
        SelectionSort.sort(a);
        assert SelectionSort.isSorted(a);
        SelectionSort.show(a);
    }
    @Test
    public void testBubbleSort(){
        Integer[] a = {24, 56, 2, 4, 90, 1};
        BubbleSort.sort(a);
        assert BubbleSort.isSorted(a);
        BubbleSort.show(a);
    }

    @Test
    public void testInsertionSort(){
        Integer[] a = {24, 56, 2, 4, 90, 1};
        InsertionSort.sort(a);
        assert InsertionSort.isSorted(a);
        InsertionSort.show(a);
    }

    @Test
    public void testShellSort(){
        Integer[] a = {24, 56, 2, 4, 90, 1};
        ShellSort.sort(a);
        assert ShellSort.isSorted(a);
        ShellSort.show(a);
    }

}
