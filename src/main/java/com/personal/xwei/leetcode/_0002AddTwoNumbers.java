package com.personal.xwei.leetcode;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example:
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */

import com.personal.xwei.leetcode.utils.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */

public class _0002AddTwoNumbers {


  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
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
    } else if (pointer.next == null) {
      pointer.val += l2.val;
      if (pointer.val >= 10) {
        pointer.val -= 10;
        l2.next.val += 1;
      }
      pointer.next = l2.next;

    } else {
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
    if (pointer.val >= 10) {
      pointer.val -= 10;
      pointer.next = new ListNode(1);
    }
    return result;
  }
}
