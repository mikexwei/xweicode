package leetcode;

import com.personal.xwei.leetcode._0038CountAndSay;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _0038CountAndSayTests {

  @DataProvider(name = "dp")
  public Object[][] dataProvider() {
    int a1 = 1;
    String z1 = "1";

    int a2 = 2;
    String z2 = "11";

    int a3 = 10;
    String z3 = "13211311123113112211";

    return new Object[][]{
        {a1, z1},
        {a2, z2},
        {a3, z3}
    };
  }

  @Test(dataProvider = "dp")
  public void test(int n, String e) {
    _0038CountAndSay solution = new _0038CountAndSay();
    Assert.assertEquals(solution.countAndSay(n), e);

  }
}
