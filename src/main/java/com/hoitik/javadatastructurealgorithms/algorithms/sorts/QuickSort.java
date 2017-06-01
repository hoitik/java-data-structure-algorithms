package com.hoitik.javadatastructurealgorithms.algorithms.sorts;

public final class QuickSort {

    public static void sort(int[] array) {

        if (array.length < 2) {
            return;
        }

        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int min, int max) {

        if (min > max) {
            return;
        }

        int pivot = partition(array, min, max);

        quickSort(array, min, pivot - 1);
        quickSort(array, pivot + 1, max);
    }

    private static int partition(int[] array, int min, int max) {
        int pivot = array[max];
        int left = min, right = max;
        while (true) {

            while(array[left] < pivot) {
                left++;
            }

            while(array[right] > pivot) {
                right--;
            }

            if (left >= right) {
                return right;
            }

            swap(array, left, right);
        }
    }

    private static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
