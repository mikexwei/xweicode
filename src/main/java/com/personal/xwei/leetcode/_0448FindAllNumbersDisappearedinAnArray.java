package com.personal.xwei.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _0448FindAllNumbersDisappearedinAnArray {
  public List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> l = new ArrayList<>();
    int len = nums.length;
    for (int i = 0; i < len; i++) {
      nums[(nums[i] - 1) % len] += len;
    }
    for (int i = 0; i < len; i++) {
      if (nums[i] <= len) {
        l.add(i + 1);
      }
    }
    return l;
  }
}
