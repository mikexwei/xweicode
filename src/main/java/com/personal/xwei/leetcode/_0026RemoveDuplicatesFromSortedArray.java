package com.personal.xwei.leetcode;

public class _0026RemoveDuplicatesFromSortedArray {
  public int removeDuplicates(int[] nums) {
    int len = nums.length;
    int i = 0;
    int ans = 0;
    for (int p = 0; p < len; p++) {
      if (nums[i] < nums[p]) nums[++i] = nums[p];
    }
    return i;
  }
}
