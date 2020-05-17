package com.zhouhao.common;

import com.zhouhao.sort.*;
import com.zhouhao.utils.TestUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {

    private static int[] source;

    private static int[] expected;

    private int[] nums;

    @BeforeAll
    static void init() {
        source = TestUtils.generateNums(100000, 1000);
        expected = TestUtils.sort(source);
    }

    @BeforeEach
    void setUp() {
        nums = Arrays.copyOf(source, source.length);
    }

    @Test
    void sort() {
        TestUtils.executeTime(() -> Arrays.sort(nums), "arrays sort");
    }

    @Test
    void insertionSort() {
        SortService sortService = new InsertionSort();

        TestUtils.executeTime(() -> sortService.sort(nums), "insertion sort");
        assertArrayEquals(expected, nums);
    }

    @Test
    void selectionSort() {
        SortService sortService = new SelectionSort();

        TestUtils.executeTime(() -> sortService.sort(nums), "selection sort");
        assertArrayEquals(expected, nums);
    }

    @Test
    void mergeSort() {
        SortService sortService = new MergeSort();

        TestUtils.executeTime(() -> sortService.sort(nums), "merge sort");
        assertArrayEquals(expected, nums);
    }

    @Test
    void bubbleSort() {
        SortService sortService = new BubbleSort();

        TestUtils.executeTime(() -> sortService.sort(nums), "bubble sort");
        assertArrayEquals(expected, nums);
    }

    @Test
    void quickSort() {
        SortService sortService = new QuickSort();

        TestUtils.executeTime(() -> sortService.sort(nums), "quick sort");
        assertArrayEquals(expected, nums);
    }


}