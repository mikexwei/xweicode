package leetcode;

import com.personal.xwei.leetcode._0014LongestCommonPrefix;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _0014LongestCommonPrefixTests {
  @DataProvider(name = "dp")
  public Object[][] dataProvider() {
    String[] case1 = {};
    String[] case2 = {"ccc", "acc"};
    String[] case3 = {"a", "aa"};
    String[] case4 = {"aa", "a"};
    String[] case5 = {"abcde", "abdce"};
    return new Object[][]{{case1, ""}, {case2, ""}, {case3, "a"}, {case4, "a"}, {case5, "ab"}};
  }

  @Test(dataProvider = "dp")
  public void test(String[]input, String expect) {
    _0014LongestCommonPrefix s = new _0014LongestCommonPrefix();
    Assert.assertEquals(s.longestCommonPrefix(input), expect);
  }
}
