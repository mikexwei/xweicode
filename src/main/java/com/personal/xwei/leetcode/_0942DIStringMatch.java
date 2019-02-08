package com.personal.xwei.leetcode;

import java.util.Arrays;

public class _0942DIStringMatch {
  public static int[] diStringMatch(String s) {
    int n_i = 1;
    int n_d = -1;
    int[] a = new int[s.length() + 1];
    a[0] = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'I') {
        a[i + 1] = n_i;
        n_i++;
      }
      else {
        a[i + 1] = n_d;
        n_d--;
      }
    }
    if (n_d < 0) {
      for (int j = 0; j < a.length; j++) {
        a[j] = a[j] - n_d - 1;
      }
    }
    return a;
  }

  public static void main(String[] args) {
    String s = "DDDDDDDDDIIIIIIIIIIIIIDIDIDIDIDIDIIIIIIIDDDDDDDDDD";
    System.out.println(Arrays.toString(diStringMatch(s)));
  }
}
