package com.learn.fundamentals.dsa.slidingwindow;

import lombok.extern.slf4j.Slf4j;

/**
 * Find the maximum sum of subarray of size k in an array of integers
 * Logic : Fixed Sliding Window
 */
@Slf4j
public class MaximumSumSubArray {

    public static void main(String[] args) {
        MaximumSumSubArray obj = new MaximumSumSubArray();
        final int[] inputArray = {9, 3, 4, 5, 2, 8, 6, 9, 1, 7, 8, 7};
        int maximumSubArraySize = 4;
        log.info("Maximum Sum of SubArray of Size : {}, is : {}", maximumSubArraySize, obj.findMaximumSumSubArray(inputArray, maximumSubArraySize));
    }

    private Integer findMaximumSumSubArray(int[] inputArray, int maximumSubArraySize) {
        if (inputArray == null || inputArray.length == 0 || maximumSubArraySize <= 0 || inputArray.length < maximumSubArraySize) {
            return null;
        }
        for (int i = maximumSubArraySize - 1; i < inputArray.length; i++) {

        }
        return null;
    }

}
