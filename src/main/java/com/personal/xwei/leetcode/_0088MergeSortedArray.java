package com.personal.xwei.leetcode;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 *
 * Note:
 *
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 * Example:
 *
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * Output: [1,2,2,3,5,6]
 */

public class _0088MergeSortedArray {

  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int p1 = m - 1;
    int p2 = n - 1;
    for (int i = m + n - 1; i >= 0; i--) {
      if (p2 < 0) {
        break;
      }
      else {
        if (p1 < 0) {
          nums1[i] = nums2[p2];
          p2--;
        }
        else {
          if (nums1[p1] > nums2[p2]) {
            nums1[i] = nums1[p1];
            nums1[p1] = 0;
            p1--;
          }
          else {
            nums1[i] = nums2[p2];
            nums2[p2] = 0;
            p2--;
          }
        }
      }
    }
  }

  public static void main(String[] args) {
    int[] nums1 = new int[] {4, 5, 6, 0, 0, 0};
    int[] nums2 = new int[] {1, 2, 3};
    merge(nums1, 3, nums2, 3);
    for (int i = 0; i < nums1.length; i++) {
      System.out.println(nums1[i]);
    }
  }
}
