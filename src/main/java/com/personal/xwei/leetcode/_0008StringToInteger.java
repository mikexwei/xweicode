package com.personal.xwei.leetcode;

/**
 * Implement atoi which converts a string to an integer.
 *
 * The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.
 *
 * The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.
 *
 * If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.
 *
 * If no valid conversion could be performed, a zero value is returned.
 *
 * Note:
 *
 * Only the space character ' ' is considered as whitespace character.
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. If the numerical value is out of the range of representable values, INT_MAX (231 − 1) or INT_MIN (−231) is returned.
 * Example 1:
 *
 * Input: "42"
 * Output: 42
 * Example 2:
 *
 * Input: "   -42"
 * Output: -42
 * Explanation: The first non-whitespace character is '-', which is the minus sign.
 *              Then take as many numerical digits as possible, which gets 42.
 * Example 3:
 *
 * Input: "4193 with words"
 * Output: 4193
 * Explanation: Conversion stops at digit '3' as the next character is not a numerical digit.
 * Example 4:
 *
 * Input: "words and 987"
 * Output: 0
 * Explanation: The first non-whitespace character is 'w', which is not a numerical
 *              digit or a +/- sign. Therefore no valid conversion could be performed.
 * Example 5:
 *
 * Input: "-91283472332"
 * Output: -2147483648
 * Explanation: The number "-91283472332" is out of the range of a 32-bit signed integer.
 *              Thefore INT_MIN (−231) is returned.
 */
public class _0008StringToInteger {
  public static int myAtoi(String str) {
    if (str.length() == 0) return 0;
    else if (str.replaceAll(" ", "").length() == 0) return 0;
    else if (str.charAt(0) == ' ') str = str.split("^\\s+")[1];

    boolean pos;
    String max = String.valueOf(Integer.MAX_VALUE);
    String min = String.valueOf(Integer.MIN_VALUE);
    String s;
    if (str.charAt(0) == '+') {
      pos = true;
      s = str.substring(1);
    }
    else if (str.charAt(0) == '-') {
      pos = false;
      s = str.substring(1);
    }
    else {
      s = str;
      pos = true;
    }

    String[] sa = s.split("\\D");
    if (sa.length < 1) return 0;
    s = sa[0];

    if (s.length() < 1) return 0;
    while (s.charAt(0) == '0' && s.length() > 1) {
      s = s.substring(1);
    }
    String compare = pos ? max : min.substring(1);
    if (s.length() > compare.length()) {
      return pos ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    }

    if (s.length() == compare.length()) {
      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) > compare.charAt(i)) return pos ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        else if (s.charAt(i) < compare.charAt(i)) break;
      }
    }
    return pos ? Integer.valueOf(s) : Integer.valueOf("-" + s);
  }

  public static void main(String args[]) {
    String s = "-2147483648";
    System.out.println(myAtoi(s));
  }
}
