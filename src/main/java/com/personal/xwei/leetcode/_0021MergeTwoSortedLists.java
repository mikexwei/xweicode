package com.personal.xwei.leetcode;

/**
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 * <p>
 * Example:
 * <p>
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 */
public class _0021MergeTwoSortedLists {
  public static class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int i) {
      val = i;
    }
  }

  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if (l1 == null && l2 == null) return null;
    else if (l1 == null) return l2;
    else if (l2 == null) return l1;
    ListNode ans;
    ListNode p;
    if (l1.val < l2.val) {
      ans = l1;
      p = ans;
      l1 = l1.next;
    } else {
      ans = l2;
      p = ans;
      l2 = l2.next;
    }

    while (l1 != null && l2 != null) {
      if (l1.val < l2.val) {
        p.next = l1;
        l1 = l1.next == null ? null : l1.next;
      } else {
        p.next = l2;
        l2 = l2.next == null ? null : l2.next;
      }
      p = p.next;
    }
    if (l1 != null) p.next = l1;
    else if (l2 != null) p.next = l2;
    return ans;
  }
}
