package leetcode;

import com.personal.xwei.leetcode._0013RomanToInteger;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _0013RomanToIntegerTests {
  @DataProvider(name = "dp")
  public static Object[][] data() {
    //input, expect
    return new Object[][]{{"IV", 4}, {"V", 5}, {"LVIII", 58}, {"MCMXCIV", 1994}};
  }

  @Test(dataProvider = "dp")
  public void test(String input, int expect) {
    _0013RomanToInteger solution = new _0013RomanToInteger();
    Assert.assertEquals(solution.romanToInt(input), expect);
  }
}
