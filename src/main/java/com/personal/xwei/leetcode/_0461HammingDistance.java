package com.personal.xwei.leetcode;

/**
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 *
 * Given two integers x and y, calculate the Hamming distance.
 *
 * Note:
 * 0 ≤ x, y < 231.
 *
 * Example:
 *
 * Input: x = 1, y = 4
 *
 * Output: 2
 *
 * Explanation:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 *        ↑   ↑
 *
 * The above arrows point to positions where the corresponding bits are different.
 */
public class _0461HammingDistance {
  public static int hammingDistance(int x, int y) {
    int counter = 0;
    while (x != 0 || y != 0) {
      counter = x % 2 == y % 2 ? counter : counter + 1;
      if (x != 0) x /= 2;
      if (y != 0) y /= 2;
    }
    return counter;
  }

  public static void main(String[] args) {
    int x = -1;
    int y = 0b0000000;
    System.out.println(hammingDistance(x, y));
  }
}
