package org.nicki;

import edu.princeton.cs.algs4.StdOut;
import org.nicki.sorting_algorithms.SortCompare;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().sortCompare();
    }

    private void sortCompare(){
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "Бвыберите способ сортировки для сравнения\n" +
                        "1) Вставки\n" +
                        "2) Выбор\n" +
                        "3) Шелла\n" +
                        "4) Слияние\n" +
                        "5) Быстрая"
        );
        String alg1 = choise(scanner.nextInt());
        System.out.print("С каким алгоритмом сравнить: ");
        String alg2 = choise(scanner.nextInt());

        System.out.print("Кол-во элементов в массиве: ");
        int n = scanner.nextInt();
        System.out.print("Кол-во массивов: ");
        int t = scanner.nextInt();

        double t1 = SortCompare.timeRandomInput(alg1, n, t);
        double t2 = SortCompare.timeRandomInput(alg2, n, t);

        StdOut.printf("Для %d случайных целых чисел\n %s в", n, alg1);
        StdOut.printf(" %.1f раз быстрее, чем %s\n", t2/t1, alg2);
    }

    private String choise(int tmp){
        String str = "";
        switch (tmp){
            case 1:
                str = "Вставки";
                break;
            case 2:
                str = "Выбор";
                break;
            case 3:
                str = "Шелла";
                break;
            case 4:
                str = "Слияние";
                break;
            case 5:
                str = "Быстрая";
                break;
        }
        return str;
    }
}

