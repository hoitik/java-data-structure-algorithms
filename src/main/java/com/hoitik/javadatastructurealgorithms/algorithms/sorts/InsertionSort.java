package com.hoitik.javadatastructurealgorithms.algorithms.sorts;

public final class InsertionSort {

    public static void sort(int[] array) {

        if (array.length < 2) {
            return;
        }

        insertionSort(array);
    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j] < array[j - 1]) {
                swap(array, j , j - 1);
                j--;
            }
        }
    }

    private static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
