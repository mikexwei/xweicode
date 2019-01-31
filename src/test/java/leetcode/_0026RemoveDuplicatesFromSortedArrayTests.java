package leetcode;

import com.personal.xwei.leetcode._0026RemoveDuplicatesFromSortedArray;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _0026RemoveDuplicatesFromSortedArrayTests {
  @DataProvider(name = "dp")
  public Object[][] dataProvider() {
    int[] input1 = new int[] {1, 1, 2, 3, 4, 4};
    int e1 = 4;

    int[] input2 = new int[] {};
    int e2 = 0;

    int[] input3 = new int[] {1};
    int e3 = 1;
    return new Object[][]{{input1, e1}, {input2, e2}, {input3, e3}};
  }

  @Test(dataProvider = "dp")
  public void test(int[] i, int e) {
    _0026RemoveDuplicatesFromSortedArray s = new _0026RemoveDuplicatesFromSortedArray();
    Assert.assertEquals(s.removeDuplicates(i), e);

  }
}
