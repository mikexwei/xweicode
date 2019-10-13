package com.personal.xwei.leetcode;

public class _0832FlippingAnImage {
  public static int[][] flipAndInvertImage(int[][] a) {
    int[][] b = new int[a.length][a[0].length];
    for (int row = 0; row < a.length; row++) {
      for (int col = 0; col < a[row].length; col++) {
        b[row][col] = 1 - a[row][a[row].length - col - 1];
      }
    }

    return b;
  }

  public static void main(String[] args) {
    int[][] b = new int[][]{{1,1,0},{1,0,1},{0,0,0}};
    int[][] a = flipAndInvertImage(b);
    for (int row = 0; row < a.length; row++) {
      for (int col = 0; col < a[row].length; col++) {
        System.out.println(a[row][col]);
      }
    }
  }
}
