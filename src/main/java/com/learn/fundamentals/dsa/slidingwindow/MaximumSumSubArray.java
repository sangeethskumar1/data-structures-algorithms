package com.learn.fundamentals.dsa.slidingwindow;

/**
 * Find the maximum sum of subarray of size k in an array of integers
 * Logic : Fixed Sliding Window
 */
public class MaximumSumSubArray {

    public static void main(String[] args) {
        MaximumSumSubArray obj = new MaximumSumSubArray();
        final int[] inputArray = {9, 3, 4, 5, 2, 8, 6, 9, 1, 7, 8, 7};
        int maximumSubArraySize = 4;
        System.out.println("Maximum Sum of SubArray of Size : " + obj.findMaximumSumSubArray(inputArray, maximumSubArraySize));
    }

    private int findMaximumSumSubArray(int[] inputArray, int maximumSubArraySize) {
        if (inputArray == null || inputArray.length == 0 || maximumSubArraySize <= 0 || inputArray.length < maximumSubArraySize) {
            return 0;
        }

        return 0;
    }

}
