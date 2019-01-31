package com.personal.xwei.leetcode;

/**
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 *
 * You may assume no duplicates in the array.
 */

public class _0035SearchIntertPosition {
  public int searchInsert(int nums[], int target) {
    int len = nums.length;
    if (len == 0) return 0;
    if (nums[0] >= target) return 0;
    for (int i = 0; i < len; i++) {
      if ((nums[i] == target) || (nums[i] > target && nums[i - 1] < target)) return i;
    }
    return len;
  }
}
