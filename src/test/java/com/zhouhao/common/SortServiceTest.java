package com.zhouhao.common;

import com.zhouhao.sort.InsertionSort;
import com.zhouhao.sort.MergeSort;
import com.zhouhao.utils.TestUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {

    private int[] nums;

    private int[] expected;

    @BeforeEach
    void setUp() {
        nums = TestUtils.generateNums(100, 100);
        expected = TestUtils.sort(nums);
    }

    @Test
    void insertionSort() {
        SortService sortService = new InsertionSort();

        sortService.sort(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void mergeSort() {
        SortService sortService = new MergeSort();

        sortService.sort(nums);
        assertArrayEquals(expected, nums);
    }

}