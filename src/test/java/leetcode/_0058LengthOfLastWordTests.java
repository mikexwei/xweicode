package leetcode;

import com.personal.xwei.leetcode._0058LengthOfLastWord;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _0058LengthOfLastWordTests {
  @DataProvider(name = "dp")
  public Object[][] dataProvider() {
    String a1 = "";
    int e1 = 0;

    String a2 = "abc ddef ";
    int e2 = 4;
    return new Object[][]{{a1, e1}, {a2, e2}};
  }

  @Test(dataProvider = "dp")
  public void test(String a, int e) {
    Assert.assertEquals(_0058LengthOfLastWord.lengthOfLastWord(a), e);

  }
}
