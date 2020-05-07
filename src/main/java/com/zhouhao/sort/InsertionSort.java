package com.zhouhao.sort;

import com.zhouhao.common.SortService;

public class InsertionSort implements SortService {

    @Override
    public void sort(int[] nums) {

        for (int i = 1; i < nums.length; i++) {

            int j, temp = nums[i];

            for (j = i; j > 0 && temp < nums[j - 1]; j--) {
                nums[j] = nums[j - 1];
            }

            nums[j] = temp;
        }

    }

}
