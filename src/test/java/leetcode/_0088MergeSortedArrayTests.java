package leetcode;

import com.personal.xwei.leetcode._0088MergeSortedArray;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _0088MergeSortedArrayTests {

  @DataProvider(name = "dp")
  public Object[][] dataProvider() {
    int[] a1 = new int[]{1, 2, 3, 0, 0, 0};
    int m1 = 3;
    int[] a2 = new int[]{4, 5, 6};
    int n1 = 3;
    int[] e = new int[]{1, 2, 3, 4, 5, 6};
    return new Object[][]{{a1, n1, a2, m1, e}};
  }

  @Test(dataProvider = "dp")
  public void test(int[] nums1, int m, int[] nums2, int n, int[] e) {
    _0088MergeSortedArray.merge(nums1, m, nums2, n);
    Assert.assertEquals(nums1, e);
  }
}
