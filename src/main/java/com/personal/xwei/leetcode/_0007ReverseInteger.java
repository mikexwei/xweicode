package com.personal.xwei.leetcode;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Example 1:
 *
 * Input: 123
 * Output: 321
 * Example 2:
 *
 * Input: -123
 * Output: -321
 * Example 3:
 *
 * Input: 120
 * Output: 21
 * Note:
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */
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
