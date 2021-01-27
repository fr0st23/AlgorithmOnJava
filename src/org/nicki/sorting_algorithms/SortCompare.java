package org.nicki.sorting_algorithms;

import edu.princeton.cs.algs4.Out;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

public class SortCompare {

    public static <T extends Comparable<T>> double time(String alg, T[] a){
        Stopwatch timer = new Stopwatch();
        if (alg.equals("Вставки")) Insertion.sort(a);
        if (alg.equals("Выбор")) Selection.sort(a);
        if (alg.equals("Шелла")) Shell.sort(a);
        if (alg.equals("Слияние")) MergeSort.sort(a);
        if (alg.equals("Быстрая")) QuickSort.sort(a);

        return timer.elapsedTime();
    }

    public static double timeRandomInput(String alg, int n, int t){
        // alg указывает алгоритм сортировки t случайных массивов длиной n
        double total = 0.0;
        Double[] a = new Double[n];
        for (int i = 0; i < t; i++){
            for (int j = 0; j < n; j++) {
                a[j] = StdRandom.uniform();
            }
            total += time(alg, a);
        }

        return total;
    }
}
