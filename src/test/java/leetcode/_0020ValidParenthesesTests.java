package leetcode;

import com.personal.xwei.leetcode._0020ValidParentheses;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _0020ValidParenthesesTests {
  @DataProvider(name = "dp")
  public Object[][] dataProvider() {
    return new Object[][]  {{"()", true}, {"([{}])", true}, {")", false}, {"", true}, {"()][]", false}};
  }

  @Test(dataProvider = "dp")
  public void test_0020ValidParentheses(String input, boolean expect) {
    _0020ValidParentheses s = new _0020ValidParentheses();
    Assert.assertEquals(s.isValid(input), expect);
  }
}
