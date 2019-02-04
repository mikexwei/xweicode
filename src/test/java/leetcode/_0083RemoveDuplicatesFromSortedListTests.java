package leetcode;

import com.personal.xwei.leetcode._0083RemoveDuplicatesFromSortedList;
import com.personal.xwei.leetcode.utils.ListNode;
import com.personal.xwei.leetcode.utils.Utils;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _0083RemoveDuplicatesFromSortedListTests {
  @DataProvider(name = "dp")
  public Object[][] dataProvider() {
    ListNode a = Utils.convertArrayToListNode(new int[] {1, 1, 1, 2, 2, 2, 2});
    ListNode e = Utils.convertArrayToListNode(new int[] {1, 2});
    return new Object[][]{
        {a, e}
    };
  }

  @Test(dataProvider = "dp")
  public void test(ListNode a, ListNode e) {
    ListNode actual = _0083RemoveDuplicatesFromSortedList.deleteDuplicates(a);
//    Assert.assertEquals(Utils.convertListNodeToList(actual), Utils.convertListNodeToList(e));

  }
}
