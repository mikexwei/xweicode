package com.personal.xwei.leetcode;

/**
 * Implement strStr().
 *
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Example 1:
 *
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * Example 2:
 *
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 * Clarification:
 *
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 *
 * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 */
public class _0028Implement_strStr {
  public int strStr(String haystack, String needle) {
    int slen = haystack.length();
    int plen = needle.length();
    if (slen == 0 && plen == 0) return 0;
    else if (slen < plen) return -1;
    else if (plen == 0) return 0;
    for (int i = 0; i < slen - plen + 1; i++) {
      if (haystack.charAt(i) == needle.charAt(0)) {
        for (int j = 0; j < plen; j++) {
          if (haystack.charAt(i + j) != needle.charAt(j)) break;
          if (j == plen - 1) return i;

        }
      }
    }
    return -1;
  }
}
