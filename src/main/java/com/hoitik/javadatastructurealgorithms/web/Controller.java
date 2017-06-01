package com.hoitik.javadatastructurealgorithms.web;

import com.hoitik.javadatastructurealgorithms.algorithms.sorts.BubbleSort;
import com.hoitik.javadatastructurealgorithms.algorithms.sorts.MergeSort;
import com.hoitik.javadatastructurealgorithms.algorithms.sorts.QuickSort;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
public class Controller {

    @ApiOperation(value="Quick Sort")
    @RequestMapping(value = "/quicksort", method = RequestMethod.GET, produces="application/json")
    public int[] quickSort(@ApiParam(value = "array", required=true) @RequestParam String array) {
        int[] intArray = Arrays.stream(array.split(",")).map(String::trim).mapToInt(Integer::valueOf).toArray();
        QuickSort.sort(intArray);
        return intArray;
    }

    @ApiOperation(value="Bubble Sort")
    @RequestMapping(value = "/bubblesort", method = RequestMethod.GET, produces="application/json")
    public int[] bubbleSort(@ApiParam(value = "array", required=true) @RequestParam String array) {
        int[] intArray = Arrays.stream(array.split(",")).map(String::trim).mapToInt(Integer::valueOf).toArray();
        BubbleSort.sort(intArray);
        return intArray;
    }

    @ApiOperation(value="Merge Sort")
    @RequestMapping(value = "/mergesort", method = RequestMethod.GET, produces="application/json")
    public int[] mergeSort(@ApiParam(value = "array", required=true) @RequestParam String array) {
        int[] intArray = Arrays.stream(array.split(",")).map(String::trim).mapToInt(Integer::valueOf).toArray();
        return MergeSort.sort(intArray);
    }
}
