package com.personal.xwei.leetcode;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class AddTwoNumbers {
  public static class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) {
      val = x;
    }
  }

  public static class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      boolean carry = false;
      ListNode result = l1;
      ListNode pointer = l1;
      while (pointer.next != null && l2.next != null) {
        pointer.val += l2.val;
        if (pointer.val >= 10) {
          pointer.val -= 10;
          l2.next.val += 1;
        }
        pointer = pointer.next;
        l2 = l2.next;
      }
      if (pointer.next == null && l2.next == null) {
        pointer.val += l2.val;
        if (pointer.val >= 10) {
          pointer.val -= 10;
          pointer.next = new ListNode(1);
        }
      }
      else if (pointer.next == null) {
        pointer.val += l2.val;
        if (pointer.val >= 10) {
          pointer.val -= 10;
          l2.next.val += 1;
          pointer.next = l2.next;
        }
      }
      else {
        pointer.val += l2.val;
        if (pointer.val >= 10) {
          pointer.val -= 10;
          pointer.next.val += 1;
        }
      }

      //clean the result single list
      //starting from the pointer position, if the value greater than 10, carry to next node
      while (pointer.next != null) {
        if (pointer.val >= 10) {
          pointer.val -= 10;
          pointer.next.val += 1;
        }
        pointer = pointer.next;

      }
      if (pointer.val >=10) {
        pointer.val -= 10;
        pointer.next = new ListNode(1);
      }
      return result;
    }
  }

//  public static void main(String[] args) {
//    ListNode l1 = new ListNode(9);
//    ListNode l2 = new ListNode(9);
//    ListNode p1 = l1;
//    ListNode p2 = l2;
//
//    int[] arr1 = new int[] {1, 0, 8, 9, 9};
//    int[] arr2 = new int[] {9, 9, 9, 9, 9};
//
//    for (int i = 0; i < arr1.length; i++) {
//      ListNode ln1 = new ListNode(arr1[i]);
//      p1.next = ln1;
//      p1 = p1.next;
//    }
//
//    for (int j = 0; j < arr2.length; j++) {
//      ListNode ln2 = new ListNode(arr2[j]);
//      p2.next = ln2;
//      p2 = p2.next;
//    }
//
////    while (l1 != null) {
////      System.out.print(String.valueOf(l1.val) + " ");
////      l1 = l1.next;
////    }
////    System.out.println("---");
////
////    while (l2 != null) {
////      System.out.print(String.valueOf(l2.val) + " ");
////      l2 = l2.next;
////    }
////    System.out.println("---");
//
//    Solution s = new Solution();
//    ListNode result  = s.addTwoNumbers(l1, l2);
//
//
//
//    while (result != null) {
//      System.out.print(String.valueOf(result.val) + " ");
//      result = result.next;
//    }
//  }
}
