package com.personal.xwei.leetcode;

/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 *
 * If the last word does not exist, return 0.
 *
 * Note: A word is defined as a character sequence consists of non-space characters only.
 *
 * Example:
 *
 * Input: "Hello World"
 * Output: 5
 */
public class _0058LengthOfLastWord
{
  public static int lengthOfLastWord(String s) {
    String[] a = s.split(" ");
    int len = a.length;
    if (len == 0) return 0;
    return a[len - 1].length();

  }
}
