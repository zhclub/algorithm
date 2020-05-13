package com.zhouhao.sort;

import com.zhouhao.common.SortService;

public class SelectionSort implements SortService {

    @Override
    public void sort(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {

            int minIndex = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }

            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }

    }

}
