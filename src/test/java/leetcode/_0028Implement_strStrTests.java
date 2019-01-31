package leetcode;

import com.personal.xwei.leetcode._0027RemoveElement;
import com.personal.xwei.leetcode._0028Implement_strStr;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _0028Implement_strStrTests {

  @DataProvider(name = "dp")
  public Object[][] dataProvider() {
    String s1 = "aaa";
    String p1 = "aaaa";
    int e1 = -1;

    String s2 = "mississippi";
    String p2 = "issipi";
    int e2 = 4;

    String s3 = "aaabb";
    String p3 = "baba";
    int e3 = -1;

    String s4 = "aaaa";
    String p4 = "baaa";
    int e4 = -1;

    String s5 = "aaaaaa";
    String p5 = "aa";
    int e5 = 0;


    return new Object[][]{
        {s1, p1, e1},
        {s2, p2, e2},
        {s3, p3, e3},
        {s4, p4, e4},
        {s5, p5, e5}
    };
  }

  @Test(dataProvider = "dp")
  public void test(String s, String p, int e) {
    _0028Implement_strStr solution = new _0028Implement_strStr();
    Assert.assertEquals(solution.strStr(s, p), e);

  }
}
