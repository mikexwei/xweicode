package com.personal.xwei.leetcode;

import java.util.Arrays;

public class _0198HouseRobber {
  private int[] memo;
  public int rob(int[] nums) {
    this.memo = new int[nums.length + 1];
    Arrays.fill(this.memo, -1);
    return rob(nums, nums.length - 1);
  }

  private int rob(int[] nums, int i)
  {
    if (i < 0) return 0;
    if (this.memo[i] >= 0) return memo[i];
    int result = Math.max(rob(nums, i - 2) + nums[i], rob(nums, i - 1));
    this.memo[i] = result;
    return result;
  }

  public static void main(String args[]) {
    _0198HouseRobber obj = new _0198HouseRobber();
    int[] nums = new int[]{11, 2,11,4,5,55};
    System.out.println(obj.rob(nums));
  }
}
