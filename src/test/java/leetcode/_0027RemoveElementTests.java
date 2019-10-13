package leetcode;

import com.personal.xwei.leetcode._0027RemoveElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _0027RemoveElementTests {

  @DataProvider(name = "dp")
  public Object[][] dataProvider() {
    int[] a1 = new int[] {1, 1, 2, 3, 4, 4};
    int v1 = 1;
    int e1 = 4;

    int[] a2 = new int[] {1, 1};
    int v2 = 1;
    int e2 = 0;

    int[] a3 = new int[] {};
    int v3 = 1;
    int e3 = 0;

    int[] a4 = new int[] {2, 3, 4, 5};
    int v4 = 1;
    int e4 = 4;

    return new Object[][]{{a1, v1, e1},
        {a2, v2, e2},
        {a3, v3, e3},
        {a4, v4, e4}
    };
  }

  @Test(dataProvider = "dp")
  public void test(int[] a, int v, int e) {
    _0027RemoveElement s = new _0027RemoveElement();
    Assert.assertEquals(s.removeElement(a, v), e);

  }
}
