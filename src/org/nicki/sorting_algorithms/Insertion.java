package org.nicki.sorting_algorithms;

public class Insertion {

    public static <T extends Comparable<T>> void sort(T[] a){
        int n = a.length;

        for (int i = 0; i < n; i++){
            for (int j = i; j > 0 && SortUtils.less(a[j], a[j-1]); j--)
                SortUtils.exch(a, j, j-1);
        }
    }
}
