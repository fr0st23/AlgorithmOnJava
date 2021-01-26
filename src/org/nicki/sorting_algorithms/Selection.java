package org.nicki.sorting_algorithms;

public class Selection {

    private Selection(){};

    public  static <T extends Comparable<T>> void sort(T[] a){
        int n = a.length;

        for (int i = 0; i < n; i++){
            int min = i;

            for (int j = i + 1; j < n; j++)
                if (SortUtils.less(a[j], a[min]))
                    min = j;
            SortUtils.exch(a, i, min);
        }
    }



}
