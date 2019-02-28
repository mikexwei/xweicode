package com.personal.xwei.leetcode;

public class _0191NumberOf1Bits {
  public static int hammingWeight(int n) {
    int counter = 0;
    while (n != 0) {
      counter = n % 2 == 0 ? counter : counter + 1;
      n = n>>>1;
    }
    return counter;
  }

  public static void main(String[] args) {
    int n = 0b11110000010000000000000011111111;
    System.out.println(_0191NumberOf1Bits.hammingWeight(n));
  }
}
