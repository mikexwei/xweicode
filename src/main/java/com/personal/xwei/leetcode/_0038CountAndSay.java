package com.personal.xwei.leetcode;

/**
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 *
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 *
 * Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.
 *
 * Note: Each term of the sequence of integers will be represented as a string.
 */
public class _0038CountAndSay {
  public String countAndSay(int n) {
    if (n == 0) return "0";
    String s = "1"; //111211
    int counter = 0;
    for (int i = 1; i < n; i++) {
      for (int l = 0, r = 1; r <= s.length() && l < s.length();) {
        if ( r == s.length() || s.charAt(l) != s.charAt(r)) {
          int len = r - l;
          String s1 = s.substring(0, l);
          String s2 = String.valueOf(r - l);
          String s3 = String.valueOf(s.charAt(l));
          String s4 = s.substring(r, s.length());

          s = s1 + s2 + s3 + s4;

          l = l + ( String.valueOf(r - l) + String.valueOf(s.charAt(l))).length();
          r = l;
        }
        else {
          r++;
        }


      }
    }
    return s;
  }
}
