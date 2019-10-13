package com.personal.xwei.leetcode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Given an array of integers and an integer k, you need to find the number of unique k-diff pairs in the array. Here a k-diff pair is defined as an integer pair (i, j), where i and j are both numbers in the array and their absolute difference is k.
 *
 * Example 1:
 * Input: [3, 1, 4, 1, 5], k = 2
 * Output: 2
 * Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
 * Although we have two 1s in the input, we should only return the number of unique pairs.
 * Example 2:
 * Input:[1, 2, 3, 4, 5], k = 1
 * Output: 4
 * Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).
 * Example 3:
 * Input: [1, 3, 1, 5, 4], k = 0
 * Output: 1
 * Explanation: There is one 0-diff pair in the array, (1, 1).
 */

public class _0532KDiffPairsInAnArray {

  public static int findPairs(int[] nums, int k) {
    if (nums.length < 2) return 0;
    if (k < 0) return 0;
    int counter = 0;
    Set<Integer> start = new HashSet<>();
    Set<Integer> dest = new HashSet<>();
    if (k != 0) {
      for (int num : nums) start.add(num);
      Iterator<Integer> itr = start.iterator();
      while (itr.hasNext()) {
        int curr = itr.next();
        int d_num = curr + k;
        if (start.contains(d_num)) {
          counter++;
        }
      }
      return counter;
    }
    else {
      for (int num : nums) {
        if (!start.contains(num)) start.add(num);
        else dest.add(num);
      }
      return dest.size();
    }
  }

  public static void main(String[] args) {
    int[] a = new int[]{1,2,4,4,5,7,1,1,1};
    int k = -2;
    System.out.println(findPairs(a, k));
  }
}
