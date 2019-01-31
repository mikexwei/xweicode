package com.personal.xwei.leetcode;

/**
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 */
public class _0026RemoveDuplicatesFromSortedArray {
  public int removeDuplicates(int[] nums) {
    int len = nums.length;
    int i = 0;
    if (len == 0) return 0;
    for (int p = 0; p < len; p++) {
      if (i == len - 1) return i + 1;
      if (nums[i] < nums[p]) {
        nums[++i] = nums[p];
      }
    }
    return i + 1;
  }
}
