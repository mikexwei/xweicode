package com.personal.xwei.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _0189RotateArray {
  public static void rotate(int[] nums, int k) {
    int len = nums.length;
    if (len > 1 && k != 0) {
      k = k % len;
      Set<Integer> set = new HashSet<>();
      for (int j = 0; j < len; j++) {
        int i = j;
        int temp = nums[i];

        while (!set.contains((i + k) % len)) {
          if (set.contains((i + k) % len)) {
            nums[(i + k) % len] = temp;
          }
          else {
            set.add((i + k) % len);
            int t = nums[(i + k) % len];
            nums[(i + k) % len] = temp;
            temp = t;
            i = (i + k) % len;
          }
        }
      }
    }
  }

//  public static void main(String[] args) {
//    int[] a = new int[] {1,2,3,4,5,6};
//    rotate(a, 2);
//    for (int i : a) {
//      System.out.println(i);
//    }
//  }
}
