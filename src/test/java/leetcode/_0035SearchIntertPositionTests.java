package leetcode;

import com.personal.xwei.leetcode._0035SearchIntertPosition;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _0035SearchIntertPositionTests {

  @DataProvider(name = "dp")
  public Object[][] dataProvider() {
    int[] a1 = new int[] {};
    int v1 = 1;
    int e1 = 0;

    int[] a2 = new int[] {-3, 1, 2, 3, 4};
    int v2 = 5;
    int e2 = 5;

    int[] a3 = new int[] {1, 2, 3};
    int v3 = 1;
    int e3 = 0;

    int[] a4 = new int[] {1, 3, 5};
    int v4 = 2;
    int e4 = 1;

    return new Object[][]{{a1, v1, e1},
        {a2, v2, e2},
        {a3, v3, e3},
        {a4, v4, e4}
    };
  }

  @Test(dataProvider = "dp")
  public void test(int[] a, int v, int e) {
    _0035SearchIntertPosition solution = new _0035SearchIntertPosition();
    Assert.assertEquals(solution.searchInsert(a, v), e);
  }
}
