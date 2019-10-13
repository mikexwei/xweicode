package com.personal.xwei.leetcode;

import java.util.*;

/**
 * Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).
 */
public class _0414ThirdMaximumNumber {
  public static int thirdMaxNumber(int[] nums) {
    int len = nums.length;
    if (len == 1) return nums[0];
    if (len == 2) return Math.max(nums[0], nums[1]);
    Set<Integer> set = new HashSet<>();
    List<Integer> max3 = new ArrayList<>();

    int p = 0;
    while (set.size() < 3 && p < len) {
      if (!set.contains(nums[p])) {
        set.add(nums[p]);
        max3.add(nums[p]);
      }

      p++;
    }

    if (max3.size() == 1) {
      return max3.get(0);
    }
    else if (max3.size() == 2) {
      return Math.max(max3.get(0), max3.get(1));
    }
    int a = max3.get(0);
    int b = max3.get(1);
    int c = max3.get(2);

    int[] max = new int[3];
    max[0] = Math.min(a, b);
    max[1] = a + b - max[0];
    if (c > max[1]) max[2] = c;
    else if (c > max[0]) {
      max[2] = max[1];
      max[1] = c;
    }
    else {
      max[2] = max[1];
      max[1] = max[0];
      max[0] = c;
    }

    for (int i = p; i < len; i++) {
      if (!set.contains(nums[i])) {
        int curr = nums[i];
        set.add(curr);
        if (curr > max[2]) {
          max[0] = max[1];
          max[1] = max[2];
          max[2] = curr;
        }
        else if (curr > max[1]) {
          max[0] = max[1];
          max[1] = curr;
        }
        else if (curr > max[0]) {
          max[0] = curr;
        }
      }
    }
    return max[0];
  }

  public static void main(String[] args) {
    int[] a = new int[] {2,2,3,1};
    System.out.println(_0414ThirdMaximumNumber.thirdMaxNumber(a));
  }
}
