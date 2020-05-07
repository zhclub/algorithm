package com.zhouhao.sort;

import com.zhouhao.common.SortService;
import com.zhouhao.utils.TestUtils;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void sort() throws Exception {
        SortService sortService = new MergeSort();

        int[] nums = TestUtils.generateNums(100, 100);
        int[] expected = TestUtils.sort(nums);
        sortService.sort(nums);
        assertArrayEquals(expected, nums);
    }

}