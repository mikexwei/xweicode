package com.personal.xwei.leetcode;

/**
 * Find the nth digit of the infinite integer sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...
 *
 * Note:
 * n is positive and will fit within the range of a 32-bit signed integer (n < 231).
 *
 * Example 1:
 *
 * Input:
 * 3
 *
 * Output:
 * 3
 * Example 2:
 *
 * Input:
 * 11
 *
 * Output:
 * 0
 *
 * Explanation:
 * The 11th digit of the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... is a 0, which is part of the number 10.
 */
public class _0400_NthDigit {
  public static int findNthDigit(int n) {
    long total = 0;
    long digit = 0;
    for (long i = 1; total < n; i++) {
      total += i * 9 * (long)Math.pow(10, i - 1);
      digit = i;
    }
    long excess = total - n;
    long max = (long)Math.pow(10, digit) - 1;
    long back = excess / digit;
    long remain = excess % digit;
    long number = max - back;

    for (long j = 0; j < remain; j++) {
      number /= 10;
    }
    long ans = number % 10;
    return (int)ans;
  }

  public static void main(String[] args) {
    System.out.println(findNthDigit(1000000000));
  }
}
