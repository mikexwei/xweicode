package leetcode;

import com.personal.xwei.leetcode._0053MaximumSubarray;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _0053MaximumSubarrayTests {

  @DataProvider(name = "dp")
  public Object[][] dataProvider() {
    int[] a1 = new int[] {-1, -6};
    int e1 = -1;

    int[] a2 = new int[] {2, -1, 6, -2, 8};
    int e2 = 16;

    return new Object[][]{{a1, e1}, {a2, e2}};
  }

  @Test(dataProvider = "dp")
  public void test(int[] a, int e) {
    Assert.assertEquals(_0053MaximumSubarray.maxSubArray(a), e);

  }
}
