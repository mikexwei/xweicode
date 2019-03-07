package com.personal.xwei.leetcode;

import com.personal.xwei.leetcode.utils.ListNode;

import java.util.HashSet;
import java.util.Set;

public class _0141LinkedListCycle {
  public static boolean hasCycle(ListNode head) {
    if (head == null) return false;
    Set<ListNode> set = new HashSet<>();
    ListNode p = head;
    while (p.next != null) {
      if (set.contains(p)) return true;
      set.add(p);
      p = p.next;
    }
    return false;
  }

  public static void main(String args[]) {
    //try
//    ListNode a = new ListNode(1);
//    ListNode b = new ListNode(2);
//    ListNode c = new ListNode(3);
//    a.next = b;
//    Set<ListNode> set = new HashSet<>();
//    set.add(a);
//    set.add(b);
//    System.out.println(set.contains(a));
//    System.out.println(set.contains(b));
//    System.out.println(set.contains(a.next));
//    System.out.println(set.contains(c));
    ListNode singleNode = new ListNode(1);
    System.out.println(hasCycle(singleNode));

    System.out.println(hasCycle(null));

    ListNode a1 = new ListNode(1);
    ListNode a2 = new ListNode(1);
    ListNode a3 = new ListNode(1);
    ListNode a4 = new ListNode(1);
    ListNode a5 = new ListNode(1);

    a1.next = a2;
    a2.next = a3;
    a3.next = a4;
    a4.next = a5;
    a5.next = a3;
    System.out.println(hasCycle(a1));
    System.out.println(hasCycle(a2));
    System.out.println(hasCycle(a3));
    System.out.println(hasCycle(a4));
    System.out.println(hasCycle(a5));




  }
}
