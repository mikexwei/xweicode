package com.personal.xwei.leetcode;

/**
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 * <p>
 * Example 1:
 * <p>
 * Input: 121
 * Output: true
 * Example 2:
 * <p>
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 * <p>
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * Follow up:
 * <p>
 * Coud you solve it without converting the integer to a string?
 */
public class _0009PalindromeNumber {
  public boolean isPalindrome(int x) {
    String s = String.valueOf(x);
    for (int i = 0, j = s.length() - 1; i <= s.length() / 2; i++) {
      if (s.charAt(i) != s.charAt(j)) {
        return false;
      }
      j--;
    }

    return true;
  }

}
