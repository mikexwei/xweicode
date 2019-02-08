package com.personal.xwei.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * A self-dividing number is a number that is divisible by every digit it contains.
 *
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
 *
 * Also, a self-dividing number is not allowed to contain the digit zero.
 *
 * Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.
 *
 * Example 1:
 * Input:
 * left = 1, right = 22
 * Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 * Note:
 *
 * The boundaries of each input argument are 1 <= left <= right <= 10000.
 */

public class _0728SelfDividingNumbers {
  public static List<Integer> selfDividingNumbers(int left, int right) {
    List<Integer> ans = new ArrayList<>();
    for (int i = left; i <= right; i++) {
      int tmp = i;
      while (tmp > 0) {
        if (tmp % 10 == 0) break;
        else if (i % (tmp % 10) == 0) tmp /= 10;
        else break;
      }
      if (tmp == 0) ans.add(i);
    }
    return ans;
  }

  public static void main(String[] args) {
    System.out.println(selfDividingNumbers(88, 22222).toString());
  }
}
