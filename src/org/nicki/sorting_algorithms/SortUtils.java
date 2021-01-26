package org.nicki.sorting_algorithms;

import edu.princeton.cs.algs4.StdOut;

public class SortUtils {

    static <T extends Comparable<T>> boolean less(T v, T w){
        return v.compareTo(w) < 0;
    }

    static <T> void exch(T[] a, int i, int j){
        T tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    static <T> void show(T[] a){
        for (int i = 0; i < a.length; i++)
            StdOut.print(a[i] + " ");
        StdOut.println();
    }

    static <T extends Comparable<T>> boolean isSorted(T[] a){
        for (int i = 0; i < a.length; i++)
            if (less(a[i], a[i-1]))
                return false;
        return true;
    }
}
