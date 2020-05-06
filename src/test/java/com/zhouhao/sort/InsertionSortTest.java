package com.zhouhao.sort;

import com.zhouhao.common.SortService;
import com.zhouhao.utils.TestUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void sort() throws Exception {
        SortService sortService = new InsertionSort();

        int[] nums = TestUtils.generateNums(100, 100);
        int[] expected = TestUtils.sort(nums);
        sortService.sort(nums);
        assertArrayEquals(expected, nums);
    }

}