package com.personal.xwei.leetcode;

import java.util.HashSet;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 * <p>
 * Example 1:
 * <p>
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 * <p>
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 * <p>
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringWithoutRepeatingCharacters {
  public int lengthOfLongestSubstring(String s) {
    int ans = 0, i = 0, j = 0;
    int len = s.length();
    HashSet<Character> set = new HashSet<>();
    while (i < len && j < len) {
      if (!set.contains(s.charAt(j))) {
        set.add(s.charAt(j++));
        ans = Math.max(ans, j - i);

      } else {
        set.remove(s.charAt(i++));
      }
    }
    return ans;
  }

  public static void main(String args[]) {
    String s = "abcbae";
    LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
    System.out.println(solution.lengthOfLongestSubstring(s));
  }

}
