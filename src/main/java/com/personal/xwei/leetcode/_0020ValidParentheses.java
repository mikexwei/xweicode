package com.personal.xwei.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 * <p>
 * Example 1:
 * <p>
 * Input: "()"
 * Output: true
 * Example 2:
 * <p>
 * Input: "()[]{}"
 * Output: true
 * Example 3:
 * <p>
 * Input: "(]"
 * Output: false
 * Example 4:
 * <p>
 * Input: "([)]"
 * Output: false
 * Example 5:
 * <p>
 * Input: "{[]}"
 * Output: true
 */
public class _0020ValidParentheses {
  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    boolean result = true;
    if (s.length() == 0) return true;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '(') stack.push(')');
      if (s.charAt(i) == '[') stack.push(']');
      if (s.charAt(i) == '{') stack.push('}');
      if (s.isEmpty()) return true
    }

  }
}
