package com.personal.xwei.leetcode;

import java.util.HashSet;
import java.util.Set;

public class _771JewelsAndStones {

  public int numJewelsInStones(String J, String S) {
    int ans = 0;
    Set j_set = new HashSet();
    for (int j = 0; j < J.length(); j++) {
      j_set.add(J.charAt(j));
    }
    for (int s = 0; s < S.length(); s++) {
      if (j_set.contains(S.charAt(s))) {
        ans++;
      }
    }
    return ans;
  }
}
