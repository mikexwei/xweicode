package com.personal.xwei.leetcode;

/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 *
 * Example 1:
 *
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 * Example 2:
 *
 * Input: "race a car"
 * Output: false
 */
public class _0125ValidPalindrome {
  public static boolean isPalindrome(String s) {
    String str = s.toLowerCase().replaceAll("[\\W_]", "");
    int i = 0, j = str.length() - 1;
    while (j >= i + 1) {
      if (str.charAt(i) != str.charAt(j)) return false;
      i++;
      j--;
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(isPalindrome("abc_123&*(&()&*()1cba"));
  }
}
