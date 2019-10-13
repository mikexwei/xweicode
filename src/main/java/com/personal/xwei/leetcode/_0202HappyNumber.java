package com.personal.xwei.leetcode;

import java.util.HashSet;
import java.util.Set;

public class _0202HappyNumber {
  public boolean isHappy(int n) {
    Set<Integer> set = new HashSet<>();
    set.add(n);
    while (n != 1) {
      int tmp = 0;
      while (n != 0) {
        tmp = tmp + (n % 10) * (n % 10);
        n = n / 10;
      }
      if (set.contains(tmp)) return false;

      else set.add(tmp);
      n = tmp;
    }
    return true;

  }

  public static void main(String[] args) {
    _0202HappyNumber obj = new _0202HappyNumber();
    System.out.println(obj.isHappy(-9));
  }
}
