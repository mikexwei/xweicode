package com.personal.xwei.leetcode;


public class _0069SqrtX {
  public static int mySqrt(int x) {
    if (x == 1) return 1;
    int ans = x / 2;
    while (ans >= 1) {
      if ((x / ans) >= ans) return ans;
      else ans = (ans + x / ans) / 2;
    }
    return 0;
  }
}
