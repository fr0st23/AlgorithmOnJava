package org.nicki.sorting_algorithms;

public class MergeSort <T extends Comparable<T>> {

    private static <T extends Comparable<T>> void merge(T[] a, int lo, int mid, int hi){
        int i = lo;
        int j = mid + 1;
        T[] tmp = (T[]) new Comparable[a.length];

        for (int k = lo; k <= hi; k++)
            tmp[k] = a[k];

        for (int k = lo; k <= hi; k++){
            if (i > mid)
                a[k] = tmp[j++];
            else if (j > hi)
                a[k] = tmp[i++];
            else if (SortUtils.less(tmp[j], tmp[i]))
                a[k] = tmp[j++];
            else
                a[k] = tmp[i++];
        }
    }

    private static <T extends Comparable<T>> void sort(T[] a, int lo, int hi){
        if (lo < hi){
            int mid = lo + (hi - lo) / 2;
            sort(a, lo, mid);
            sort(a, mid + 1, hi);
            merge(a, lo, mid, hi);
        }
    }

    public static <T extends Comparable<T>> void sort(T[] a){
        sort(a, 0, a.length - 1);
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
