package com.personal.xwei.leetcode;

public class _0581ShortestUnsortedContinuousSubarray {
  public static int findUnsortedSubarray(int[] nums) {
    if (nums.length <= 1) return 0;
    int len = nums.length;
    int left = len - 1;
    int right = 0;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = len - 1; i >= 0; i--) {
      if (nums[i] < min) min = nums[i];
      if (nums[i] > min) left = i;
    }

    for (int j = 0; j < len; j++) {
      if (nums[j] > max) max = nums[j];
      if (nums[j] < max) right = j;
    }
    return right >= left ? right - left + 1 : 0;
  }

  public static void main(String[] args) {
    int[] a = new int[]{0,1,2,9,11, 11};
    System.out.println(findUnsortedSubarray(a));
  }
}
