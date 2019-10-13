package com.personal.xwei.leetcode;

public class _0475Heaters {
  public static int findRadius(int[] houses, int[] heaters) {
    int ans = Integer.MIN_VALUE;
    for (int house : houses) {
      int d = Integer.MAX_VALUE;

      for (int heater: heaters) {
        d = Math.min(d, Math.abs(heater - house));
      }
      ans = Math.max(ans, d);
    }
    return ans;
  }

  public static void main(String[] args) {
    int[] houses = new int[] {};
    int[] p = new int[] {1,4};
    System.out.println(findRadius(houses, p));
  }
}
