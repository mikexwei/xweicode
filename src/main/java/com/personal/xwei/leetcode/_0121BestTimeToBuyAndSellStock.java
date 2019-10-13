package com.personal.xwei.leetcode;

public class _0121BestTimeToBuyAndSellStock {
  public static int maxProfit(int[] prices) {
    int min = Integer.MAX_VALUE;
    int result = 0;
    for (int i = 0; i < prices.length; i++) {
      min = Math.min(min, prices[i]);
      int gain = prices[i] - min;
      result = Math.max(result, gain);
    }
    return result;
  }

  public static void main(String args[]) {
    int[] a1 = {1,2,3,14,5,6,7,8,9,0};
    int[] a2 = {-9,1,1};
    int[] a3 = {5,4,3,3,3,3,3};


    System.out.println(maxProfit(a1));
    System.out.println(maxProfit(a2));
    System.out.println(maxProfit(a3));

  }
}
