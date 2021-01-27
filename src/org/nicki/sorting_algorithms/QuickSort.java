package org.nicki.sorting_algorithms;

import edu.princeton.cs.algs4.StdRandom;

public class QuickSort {

    private static <T extends Comparable<T>> void sort(T[] a, int lo, int hi){
        if (lo < hi){
            int j = partition(a, lo, hi);
            sort(a, lo, j - 1);
            sort(a, j + 1, hi);
        }
    }

    public static <T extends Comparable<T>> void sort(T[] a){
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    private static <T extends Comparable<T>> int partition(T[] a, int lo, int hi){
        int i = lo;
        int j = hi + 1;
        T mid = a[lo];

        while (true){
            while (SortUtils.less(a[++i], mid))
                if (i == hi) break;
            while (SortUtils.less(mid, a[--j]))
                if (j == lo) break;
            if (i >= j) break;
            SortUtils.exch(a, i, j);
        }
        SortUtils.exch(a, lo, j);
        return j;
    }

    public static void main (String[] args){
        //Integer test
        Integer[] intTest = {4, 23, 6, 78, 1, 54, 231, 9, 12};
        sort(intTest);
        SortUtils.show(intTest);

        //String test
        String[] stringTest = {"c", "a", "e", "b", "d", "e", "l"};
        sort(stringTest);
        SortUtils.show(stringTest);
    }

}
