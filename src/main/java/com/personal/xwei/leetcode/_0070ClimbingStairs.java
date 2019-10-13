package com.personal.xwei.leetcode;

public class _0070ClimbingStairs {
  public static int climbStairs(int n) {
    if (n <= 1) return 1;
    else return climbStairs(n-1) + climbStairs(n-2);
  }
}
