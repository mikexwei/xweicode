package com.personal.xwei.leetcode;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 *
 * Example:
 *
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 */
public class _0053MaximumSubarray {
  public static int maxSubArray(int[] nums) {
    int maxToHere = nums[0];
    int maxInHistory = nums[0];
    for (int i = 1; i < nums.length; i++) {
      maxToHere = Math.max(maxToHere + nums[i], nums[i]);
      maxInHistory = Math.max(maxInHistory, maxToHere);
    }
    return maxInHistory;
  }
}
