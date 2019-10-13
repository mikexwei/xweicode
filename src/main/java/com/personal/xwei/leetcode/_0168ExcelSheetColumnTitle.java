package com.personal.xwei.leetcode;

import java.util.Stack;

public class _0168ExcelSheetColumnTitle {
  public static String convertToTitle(int n) {
    if (n < 1) return "";
    int step = 'A';
    String s = "";
    Stack<Integer> stack = new Stack<>();
    while (n > 0) {
      stack.push((n - 1) % 26);
      n = n - (n - 1) % 26;
      n = (n - 1) / 26;
    }
    while (stack.size() > 0) {
      s = s + String.valueOf((char)(stack.pop() + step));
    }
    return s;
  }

  public static void main(String[] args) {
    for (int i = 0; i < 5000; i++) {
      System.out.println(String.valueOf(i) + " -> " + convertToTitle(i));
    }
  }
}
