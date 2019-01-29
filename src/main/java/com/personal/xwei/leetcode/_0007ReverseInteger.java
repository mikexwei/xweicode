package com.personal.xwei.leetcode;

public class _0007ReverseInteger {
  public int reverse(int x) {
    if (x == -2147483648) return 0;
    int a = x;
    boolean positive = a >>> 31 == 1 ? false : true;
    if (!positive) {
      x = ~x + 1;
    }
    int ans = 0;
    int tmp;

    while (x != 0) {
      tmp = x % 10;
      if ((ans == 214748364 && tmp > 7) || ans > 214748364) {
        return ans = 0;
      }
      ans = ans * 10 + tmp;
      x /= 10;
    }
    if (positive) {
      return ans;
    } else {
      return ~ans + 1;
    }
  }
}
