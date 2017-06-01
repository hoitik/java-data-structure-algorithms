package com.hoitik.javadatastructurealgorithms.algorithms.sorts;

public final class MergeSort {

    public static int[] sort(int[] array) {

        if (array.length < 2) {
            return array;
        }
        return mergeSort(array, 0, array.length - 1);
    }

    private static int[] mergeSort(int[] array, int min, int max) {

        if (min == max) {
            return new int[]{array[min]};
        }

        int mid = (min + max) / 2;
        int[] left = mergeSort(array, min, mid);
        int[] right = mergeSort(array, mid + 1, max);

        return combine(left, right);
    }

    private static int[] combine(int[] left, int[] right){

        int[] result = new int[left.length + right.length];

        int resultIndex = 0;
        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] < right[rightIndex]) {
                result[resultIndex++] = left[leftIndex++];
            } else {
                result[resultIndex++] = right[rightIndex++];
            }
        }

        while (leftIndex < left.length) {
            result[resultIndex++] = left[leftIndex++];
        }
        while (rightIndex < right.length) {
            result[resultIndex++] = right[rightIndex++];
        }

        return result;
    }
}
