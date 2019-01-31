package com.personal.xwei.leetcode;

/**
 * Given an array nums and a value val, remove all instances of that value in-place and return the new length.
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */
public class _0027RemoveElement {
  public int removeElement(int[] nums, int val) {
    int len = nums.length;
    if (len == 0) return 0;
    int i = 0;
    for (int p = 0; p < len; p++) {
      if (nums[p] != val) {
        nums[i] = nums[p];
        i++;
      }
    }
    return i;
  }
}
