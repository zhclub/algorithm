package com.zhouhao.sort;

import com.zhouhao.common.SortService;

public class QuickSort implements SortService {

    @Override
    public void sort(int[] nums) {
        quickSort(nums, 0, nums.length);
    }

    private void quickSort(int[] nums, int begin, int end) {

        if (end - begin < 2) {
            return;
        }

        int[] temp = new int[end - begin];
        int j = 0, base = (begin + end) / 2;

        for (int i = begin, k = temp.length - 1; i < end; i++) {
            if (i != base && nums[i] < nums[base]) {
                temp[j++] = nums[i];
            } else if (i != base){
                temp[k--] = nums[i];
            }
        }

        temp[j] = nums[base];

        System.arraycopy(temp, 0, nums, begin, end - begin);

        quickSort(nums, begin, begin + j);
        quickSort(nums, begin + j + 1, end);
    }
}
