package com.personal.xwei.leetcode;

import com.personal.xwei.leetcode.utils.TreeNode;

/**
 * Given two binary trees, write a function to check if they are the same or not.
 * <p>
 * Two binary trees are considered the same if they are structurally identical and the nodes have the same value.
 */
public class _0100SameTree {
  public static boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null && q == null) return true;
    else if (p == null || q == null) return false;

    if(p.val == q.val)
      return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    return false;
  }
}
