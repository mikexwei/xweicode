package leetcode;

import com.personal.xwei.leetcode._0021MergeTwoSortedLists;
import com.personal.xwei.leetcode._0021MergeTwoSortedLists.ListNode;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class _0021MergeTwoSortedListsTests {


  private ListNode convertArrayToListNode(int[] arr) {
    ListNode ln = new ListNode(arr[0]);
    ListNode p = ln;
    for (int i = 1; i < arr.length; i++) {
      p.next = new ListNode(arr[i]);
      p = p.next;
    }
    return ln;
  }

  private List convertListNodeToList(ListNode head) {
    List<Integer> al = new ArrayList<>();
    ListNode p = head;
    al.add(p.val);
    while (p.next != null) {
      al.add(p.next.val);
      p = p.next;
    }
    return al;
  }

  @DataProvider(name = "dp")
  public Object[][] dataProvider() {
    int[] a1 = new int[]{1, 3, 4};
    int[] b1 = new int[]{1, 3, 4};
    int[] e1 = new int[]{1, 1, 3, 3, 4, 4};

    int[] a2 = new int[]{1};
    int[] b2 = new int[]{1, 3, 4};
    int[] e2 = new int[]{1, 1, 3, 4};

    int[] a3 = new int[]{1, 7, 9};
    int[] b3 = new int[]{3, 4};
    int[] e3 = new int[]{1, 3, 4, 7, 9};
    return new Object[][]{{convertArrayToListNode(a1), convertArrayToListNode(b1), convertArrayToListNode(e1)},
        {convertArrayToListNode(a2), convertArrayToListNode(b2), convertArrayToListNode(e2)},
        {convertArrayToListNode(a3), convertArrayToListNode(b3), convertArrayToListNode(e3)},
        {null, null, null}
    };
  }

  @Test(dataProvider = "dp")
  public void test(ListNode input1, ListNode input2, ListNode expect) {
    _0021MergeTwoSortedLists s = new _0021MergeTwoSortedLists();
    ListNode actual = s.mergeTwoLists(input1, input2);
    if (expect == null) {
      Assert.assertEquals(actual, expect);
    }
    else {
      Assert.assertEquals(convertListNodeToList(actual).iterator(), convertListNodeToList(expect).iterator());
    }
  }
}
