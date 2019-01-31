package leetcode;

import com.personal.xwei.leetcode._0002AddTwoNumbers;
import com.personal.xwei.leetcode._0002AddTwoNumbers.ListNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _0002AddTwoNumbersTests {

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

  @Test(testName = "Same length no carry")
  public void testSameLengthNoCarry() {
    int[] arr1 = new int[]{1, 2, 3};
    int[] arr2 = new int[]{2, 3, 4};
    ListNode l1 = convertArrayToListNode(arr1);
    ListNode l2 = convertArrayToListNode(arr2);


    List actual = convertListNodeToList(new _0002AddTwoNumbers().addTwoNumbers(l1, l2));
    List expect = Arrays.asList(3, 5, 7);
    Assert.assertEquals(expect.iterator(), actual.iterator(), "not match");
  }

  @Test(testName = "Same length with carry")
  public void testSameLengthWithCarry() {
    int[] arr1 = new int[]{1, 5, 3};
    int[] arr2 = new int[]{2, 8, 4};
    ListNode l1 = convertArrayToListNode(arr1);
    ListNode l2 = convertArrayToListNode(arr2);


    List actual = convertListNodeToList(new _0002AddTwoNumbers().addTwoNumbers(l1, l2));
    List expect = Arrays.asList(3, 3, 8);
    Assert.assertEquals(expect.iterator(), actual.iterator(), "not match");
  }

  @Test(testName = "l1 longer with 2 carries")
  public void testL1Longer() {
    int[] arr1 = new int[]{1, 5, 3, 9, 9, 9, 8};
    int[] arr2 = new int[]{2, 8, 9};
    ListNode l1 = convertArrayToListNode(arr1);
    ListNode l2 = convertArrayToListNode(arr2);


    List actual = convertListNodeToList(new _0002AddTwoNumbers().addTwoNumbers(l1, l2));
    List expect = Arrays.asList(3, 3, 3, 0, 0, 0, 9);
    Assert.assertEquals(expect.iterator(), actual.iterator(), "not match");
  }

  @Test(testName = "l2 longer with 2 carries")
  public void testL2Longer() {
    int[] arr2 = new int[]{1, 5, 3, 9, 9, 9, 8};
    int[] arr1 = new int[]{2, 8, 9};
    ListNode l1 = convertArrayToListNode(arr1);
    ListNode l2 = convertArrayToListNode(arr2);


    List actual = convertListNodeToList(new _0002AddTwoNumbers().addTwoNumbers(l1, l2));
    List expect = Arrays.asList(3, 3, 3, 0, 0, 0, 9);
    Assert.assertEquals(expect.iterator(), actual.iterator(), "not match");
  }

  @Test(testName = "l1 only 0")
  public void testL1OnlyZero() {
    int[] arr1 = new int[]{0};
    int[] arr2 = new int[]{2, 8, 9};
    ListNode l1 = convertArrayToListNode(arr1);
    ListNode l2 = convertArrayToListNode(arr2);


    List actual = convertListNodeToList(new _0002AddTwoNumbers().addTwoNumbers(l1, l2));
    List expect = Arrays.asList(2, 8, 9);
    Assert.assertEquals(expect.iterator(), actual.iterator(), "not match");
  }

  @Test(testName = "l2 only 0")
  public void testL2OnlyZero() {
    int[] arr2 = new int[]{0};
    int[] arr1 = new int[]{2, 8, 9};
    ListNode l1 = convertArrayToListNode(arr1);
    ListNode l2 = convertArrayToListNode(arr2);


    List actual = convertListNodeToList(new _0002AddTwoNumbers().addTwoNumbers(l1, l2));
    List expect = Arrays.asList(2, 8, 9);
    Assert.assertEquals(expect.iterator(), actual.iterator(), "not match");
  }
}
