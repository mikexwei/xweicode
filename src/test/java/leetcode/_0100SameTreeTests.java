package leetcode;

import com.personal.xwei.leetcode._0100SameTree;
import com.personal.xwei.leetcode.utils.TreeNode;
import com.personal.xwei.leetcode.utils.Utils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _0100SameTreeTests {

  @Test
  public void testTrue() {
    TreeNode tn1 = Utils.convertArrayToTreeNode(new int[] {1, 2, 3, 4, 5, 6, 7});
    TreeNode tn2 = Utils.convertArrayToTreeNode(new int[] {1, 2, 3, 4, 5, 6, 7});
    Assert.assertTrue(_0100SameTree.isSameTree(tn1, tn2));
  }

  @Test
  public void testFalse() {
    TreeNode tn1 = Utils.convertArrayToTreeNode(new int[] {1, 2, 3, 4, 5, 7});
    TreeNode tn2 = Utils.convertArrayToTreeNode(new int[] {1, 2, 3, 4, 5, 6, 7});
    Assert.assertFalse(_0100SameTree.isSameTree(tn1, tn2));
  }
}
