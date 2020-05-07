package com.zhouhao.sort;

import com.zhouhao.common.SortService;

public class MergeSort implements SortService {

    @Override
    public void sort(int[] nums) {
        mergeSort(nums, 0, nums.length);
    }

    private void mergeSort(int[] nums, int begin, int end) {
        if (end - begin <= 1) {
            return;
        }

        int mid = (begin + end) / 2;

        mergeSort(nums, begin, mid);
        mergeSort(nums, mid, end);

        mergeArrayOrderly(nums, begin, mid, end);
    }

    private void mergeArrayOrderly(int[] nums, int begin, int mid, int end) {

        // merge [begin, mid) & (mid, end]
        int[] temp = new int[end - begin];
        int i, j, k;

        for (i = 0, j = begin, k = mid; j < mid && k < end; i++) {
            if (nums[j] < nums[k]) {
                temp[i] = nums[j++];
            } else {
                temp[i] = nums[k++];
            }
        }

        if (j != mid) {
            splitJoint(temp, i, nums, j);
        } else if (k != end) {
            splitJoint(temp, i, nums, k);
        }

        for (i = begin; i < end; i++) {
            nums[i] = temp[i - begin];
        }
    }

    private void splitJoint(int[] target, int i, int[] source, int j) {
        for (; i < target.length; i++, j++) {
            target[i] = source[j];
        }
    }
}
