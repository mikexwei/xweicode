package com.personal.xwei.leetcode;

/**
 * Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
 *
 * You may return any answer array that satisfies this condition.
 *
 *
 *
 * Example 1:
 *
 * Input: [3,1,2,4]
 * Output: [2,4,3,1]
 * The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 */
public class _0905SortArrayByParity {
  public static int[] sortArrayByParity(int[] a) {
    int even = a.length - 1;
    int odd = 0;
    while (even > odd) {
      if (a[odd] % 2 == 1 && a[even] % 2 != 1) {
        int temp = a[odd];
        a[odd] = a[even];
        a[even] = temp;
        odd++;
        even--;
      }
      else {
        if (a[odd] % 2 == 0) odd++;
        if (a[even] % 2 != 0) even--;
      }
    }
    return a;
  }

  public static void main(String[] args) {
    int[] a = {1,2,3,4,5,33,3,3,3,3,3,3,2,2,2,2,2,2,2,2};
//    sortArrayByParity(a);
    for (int i : sortArrayByParity(a)) System.out.println(i);
  }
}
