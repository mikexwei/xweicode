package com.personal.xwei.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Count the number of prime numbers less than a non-negative number, n.
 *
 * Example:
 *
 * Input: 10
 * Output: 4
 * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 */

public class _0204CountPrimes {
  public static int countPrimes(int n) {
    n = n - 1; // because 'less' not 'less or equals'
    if (n < 2) return 0;
    Set<Integer> set = new HashSet<>();
    int limit = (int) Math.sqrt(n) + 1;
    for (int i = 2; i <= limit; i++) {
      if (!set.contains(i)) {
        int step = i;
        for (int j = step*2; j <= n; j = j + step) {
          set.add(j);
        }
      }
    }
    return n - set.size() - 1;
  }
}
