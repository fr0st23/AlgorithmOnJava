package org.nicki;

import edu.princeton.cs.algs4.StdOut;
import org.nicki.sorting_algorithms.Insertion;
import org.nicki.sorting_algorithms.Selection;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String alg1 = scanner.nextLine();
        String alg2 = scanner.nextLine();

        int n = scanner.nextInt();
        int t = scanner.nextInt();

        double t1 = SortCompare.timeRandomInput(alg1, n, t);
        double t2 = SortCompare.timeRandomInput(alg2, n, t);

        StdOut.printf("Для %d случайных целых чисел\n %s в", n, alg1);
        StdOut.printf(" %.1f раз быстрее, чем %s\n", t2/t1, alg2);
    }
}

