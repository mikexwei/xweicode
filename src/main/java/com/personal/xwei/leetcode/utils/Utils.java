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

  public static TreeNode convertArrayToTreeNode(int[] a) {
    if (a.length == 0) return null;
    else {
      TreeNode root = new TreeNode(a[0]);
      return insertTreeNode(a, root, 0);
    }
  }

  private static TreeNode insertTreeNode(int[] a, TreeNode root, int i) {
    if (i < a.length) {
      TreeNode temp = new TreeNode(a[i]);
      root = temp;
      root.left = insertTreeNode(a, root.left, 2*i + 1);
      root.right = insertTreeNode(a, root.right, 2*i + 2);
    }
    return root;
  }

  public static void inOrder(TreeNode root)
  {
    if (root != null) {
      inOrder(root.left);
      System.out.print(root.val + " ");
      inOrder(root.right);
    }
  }

  // Driver program to test above function
  public static void main(String args[])
  {
//    TreeNode t2 = new TreeNode();
    int arr[]  = { 1, 2, 3, 4, 5, 6, 6, 6, 6 };
    TreeNode tree = convertArrayToTreeNode(arr);
    inOrder(tree);
  }
}
