package com.personal.xwei.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * <p>
 * Example 1:
 * <p>
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 * <p>
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * Note:
 * <p>
 * All given inputs are in lowercase letters a-z.
 */
public class _0014LongestCommonPrefix {
  public String longestCommonPrefix(String[] strs) {
    boolean same = true;
    if (strs.length == 0) return "";
    String standard = strs[0];
    int limit = standard.length();
    int idx = 0;
    for (idx = 0; idx < limit; idx++) {
      System.out.println(standard.length());
      for (String str : strs) {
        if (str.length() < limit) {
          limit = str.length();
        }
        if (str.length() <= idx) {
          return standard.substring(0, idx);
        }
        else {
          same = same && (standard.charAt(idx) == str.charAt(idx));
        }
        if (!same) {
          return standard.substring(0, idx);
        }
      }

    }
    return standard.substring(0, idx);
  }
}
