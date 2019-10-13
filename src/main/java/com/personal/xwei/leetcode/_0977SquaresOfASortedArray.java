package com.personal.xwei.leetcode;

/**
 * Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Example 2:
 * <p>
 * Input: [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 */
public class _0977SquaresOfASortedArray {
  public int[] sortedSquares(int[] A) {
    int i = 0;
    int j = A.length - 1;
    int[] result = new int[A.length];
    int pointer = j;
    while (i <= j) {
      if (Math.abs(A[i]) >= A[j]) {
        result[pointer] = A[i] * A[i];
        pointer--;
        i++;
      } else {
        result[pointer] = A[j] * A[j];
        pointer--;
        j--;
      }
    }
    return result;
  }
}
