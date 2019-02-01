package com.personal.xwei.leetcode;

/**
 * Given two binary strings, return their sum (also a binary string).
 *
 * The input strings are both non-empty and contains only characters 1 or 0.
 *
 * Example 1:
 *
 * Input: a = "11", b = "1"
 * Output: "100"
 * Example 2:
 *
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 */

public class _0067AddBinary {
  public static String addBinary(String a, String b) {
    int alen = a.length();
    int blen = b.length();
    if (alen > blen) {
      for (int i = 0; i < alen - blen; i++) {
        b = "0" + b;
      }
    }
    else {
      for (int i = 0; i < blen - alen; i++) {
        a = "0" + a;
      }
    }
    String s = "";
    int carry = 0;

    for (int j = a.length() - 1; j >=0; j--) {
      int sum = Character.getNumericValue(a.charAt(j)) + Character.getNumericValue(b.charAt(j)) + carry;
      carry = sum > 1 ? 1 : 0;
      String temp_s = carry == 1? String.valueOf(sum - 2) : String.valueOf(sum);
      s = temp_s + s;
    }
    if (carry == 1) return "1" + s;
    return s;

  }
}
