package com.zhouhao.sort;

import com.zhouhao.common.SortService;

public class BubbleSort implements SortService {

    @Override
    public void sort(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {

            boolean flag = true;
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                    flag = false;
                }
            }

            if (flag) {
                return;
            }
        }
    }

}
