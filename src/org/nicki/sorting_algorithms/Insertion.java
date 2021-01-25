package org.nicki.sorting_algorithms;

import edu.princeton.cs.algs4.StdOut;

public class Insertion {

    public static void sort(Comparable[] a){
        int n = a.length;

        for (int i = 0; i < n; i++){
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--)
                exch(a, j, j-1);
        }
    }

    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void show(Comparable[] a){
        for (int i = 0; i < a.length; i++)
            StdOut.print(a[i] + " ");
        StdOut.println();
    }

    public static boolean isSorted(Comparable[] a){
        for (int i = 0; i < a.length; i++)
            if (less(a[i], a[i-1]))
                return false;
        return true;
    }
}
