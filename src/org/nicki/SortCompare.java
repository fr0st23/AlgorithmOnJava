package org.nicki;

import edu.princeton.cs.algs4.Out;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;
import org.nicki.sorting_algorithms.*;

public class SortCompare {

    public static double time(String alg, Comparable[] a){
        Stopwatch timer = new Stopwatch();
        if (alg.equals("Вставки")) Insertion.sort(a);
        if (alg.equals("Выбор")) Selection.sort(a);
        if (alg.equals("Шелла")) Shell.sort(a);

        return timer.elapsedTime();
    }

    public static double timeRandomInput(String alg, int n, int t){
        // alg указывает алгоритм сортировки t случайных массивов длиной n
        double total = 0.0;
        Comparable[] a = new Comparable[n];
        Out out = new Out("11.txt");
        for (int i = 0; i < t; i++){
            for (int j = 0; j < n; j++) {
                a[j] = StdRandom.uniform(100);
                out.print(a[j] + " ");
            }
            out.println();
            out.close();
            total += time(alg, a);
        }

        return total;
    }
}
