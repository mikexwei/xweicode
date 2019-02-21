package com.personal.xwei.leetcode;



import com.sun.tools.javac.util.Pair;

import java.util.HashMap;
import java.util.Map;

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
public class _0303RangeSumQueryImmutable {
  private int[] nums;
  private Map<Pair, Integer> map = new HashMap<>();


  public _0303RangeSumQueryImmutable(int[] nums) {
    this.nums = nums;
  }

  public int sumRange(int i, int j) {
    if (j >= nums.length - 1) j = nums.length - 1;
//    String range = String.valueOf(i) + String.valueOf(j);
    Pair range = new Pair(i, j);
    if (this.map.containsKey(range)) return this.map.get(range);
    int result = 0;
    for (int idx = i; idx <= j; idx++) {
      result += nums[idx];
    }
    this.map.put(range, result);
    return result;
  }

  public static void main(String[] args) {
    int[] nums = new int[]{9, 2, -3, 4};
    _0303RangeSumQueryImmutable o1= new _0303RangeSumQueryImmutable(nums);
    System.out.println(o1.sumRange(0, 1));
    System.out.println(o1.sumRange(0, 1));

  }
}
