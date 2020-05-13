package com.zhouhao.utils;

import java.util.Arrays;

public class TestUtils {

    public static int generateRandomNum(int limit) {
        return (int) (Math.random() * limit);
    }

    public static int[] generateNums(int n, int limit) {
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = generateRandomNum(limit);
        }

        return nums;
    }

    public static int[] sort(int[] nums) {
        int[] temp = Arrays.copyOf(nums, nums.length);
        Arrays.sort(temp);
        return temp;
    }

    public static long executeTime(Executor executor, String methodName) {
        long start = System.currentTimeMillis();
        executor.exec();
        long time = System.currentTimeMillis() - start;
        System.out.println(methodName + " execution for " + time + " ms");
        return time;
    }

    public static void main(String[] args) {

    }

    @FunctionalInterface
    public interface Executor {
        void exec();
    }
}
