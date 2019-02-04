package com.personal.xwei.leetcode;


import com.personal.xwei.leetcode.utils.ListNode;
import com.personal.xwei.leetcode.utils.Utils;

public class _0083RemoveDuplicatesFromSortedList {

  public static ListNode deleteDuplicates(ListNode head) {
    if (head == null) return null;
    ListNode p = head;
    if (p.next == null) return head;
    while (p.next.next != null) {
      if (p.val == p.next.val) {
        p.next = p.next.next;
      }
      else {
        p = p.next;
      }
    }
    if (p.val == p.next.val) p.next = null;
    return head;
  }

  public static void main(String[] args) {
    int [] a = new int[] {1, 1, 1, 2, 2, 2, 2};
    ListNode ln = Utils.convertArrayToListNode(a);
    ListNode result = _0083RemoveDuplicatesFromSortedList.deleteDuplicates(ln);
    while (result.next != null) {
      System.out.println(result.val);
      result = result.next;
    }
    System.out.println(result.val);



  }
}
