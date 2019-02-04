package com.personal.xwei.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given two strings A and B of lowercase letters, return true if and only if we can swap two letters in A so that the result equals B.
 *
 *
 *
 * Example 1:
 *
 * Input: A = "ab", B = "ba"
 * Output: true
 * Example 2:
 *
 * Input: A = "ab", B = "ab"
 * Output: false
 * Example 3:
 *
 * Input: A = "aa", B = "aa"
 * Output: true
 * Example 4:
 *
 * Input: A = "aaaaaaabc", B = "aaaaaaacb"
 * Output: true
 * Example 5:
 *
 * Input: A = "", B = "aa"
 * Output: false
 */
public class _0859BuddyStrings {
  public static boolean buddyStrings(String a, String b) {
    if (a.length() != b.length()) return false;
    if (a.length() == 0 || b.length() == 0) return false;
    int counter = 0;
    boolean hasSameChar = false;
    Set<Character> set = new HashSet<>();
    char[] a_diff = new char[2];
    char[] b_diff = new char[2];

    for (int i = 0; i < a.length(); i++) {
      if (set.contains(a.charAt(i))) hasSameChar = true;
      else set.add(a.charAt(i));
      if (a.charAt(i) != b.charAt(i)) {
        if (counter < 2) {
          a_diff[counter] = a.charAt(i);
          b_diff[counter] = b.charAt(i);
          counter++;
        }
        else {
          return false;
        }
      }
    }
    if (counter == 0) {
      return hasSameChar;
    }
    else {
      if (counter == 1) return false;
      else {
        if (a_diff[0] == b_diff[1] && a_diff[1] == b_diff[0]) return true;
        else return false;
      }
    }
  }

}
