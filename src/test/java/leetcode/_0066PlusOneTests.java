package leetcode;

import com.personal.xwei.leetcode._0066PlusOne;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _0066PlusOneTests {
  @DataProvider(name = "dp")
  public Object[][] dataProvider() {
    int[] a1 = new int[] {1, 2};
    int[] e1 = new int[] {1, 3};

    int[] a2 = new int[] {9};
    int[] e2 = new int[] {1, 0};

    int[] a3 = new int[] {9, 9, 9, 9, 9};
    int[] e3 = new int[] {1, 0, 0, 0, 0, 0};

    return new Object[][]{
        {a1, e1},
        {a2, e2},
        {a3, e3}
    };
  }

  @Test(dataProvider = "dp")
  public void test(int[] a, int[] e) {
    Assert.assertEquals(_0066PlusOne.plusOne(a), e);

  }
}
