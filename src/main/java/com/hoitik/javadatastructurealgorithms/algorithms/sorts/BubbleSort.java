package com.hoitik.javadatastructurealgorithms.algorithms.sorts;

public final class BubbleSort {

    public static void sort(int[] array) {
        if (array.length < 2) {
            return;
        }

        boolean modified = true;
        while (modified) {
            modified = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    modified = true;
                }
            }
        }
    }

    private static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
