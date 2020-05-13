package com.zhouhao.common;

import com.zhouhao.sort.BubbleSort;
import com.zhouhao.sort.InsertionSort;
import com.zhouhao.sort.MergeSort;
import com.zhouhao.sort.SelectionSort;
import com.zhouhao.utils.TestUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {

    private int[] nums;

    private int[] expected;

    @BeforeEach
    void setUp() {
        nums = TestUtils.generateNums(10000, 1000);
        expected = TestUtils.sort(nums);
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
}