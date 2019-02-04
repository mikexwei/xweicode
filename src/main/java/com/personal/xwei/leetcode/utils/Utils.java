package com.personal.xwei.leetcode.utils;

import java.util.ArrayList;
import java.util.List;

public class Utils {
  public static ListNode convertArrayToListNode(int[] arr) {
    ListNode ln = new ListNode(arr[0]);
    ListNode p = ln;
    for (int i = 1; i < arr.length; i++) {
      p.next = new ListNode(arr[i]);
      p = p.next;
    }
    return ln;
  }

  public static List convertListNodeToList(ListNode head) {
    List<Integer> al = new ArrayList<>();
    ListNode p = head;
    al.add(p.val);
    while (p.next != null) {
      al.add(p.next.val);
      p = p.next;
    }
    return al;
  }
}
