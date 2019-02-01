package leetcode;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.personal.xwei.leetcode._0067AddBinary;


public class _0067AddBinaryTests {
  @DataProvider(name = "dp")
  public Object[][] dataProvider() {
    String a1 = "1";
    String b1 = "1";
    String e1 = "10";

    String a2 = "11";
    String b2 = "111";
    String e2 = "1010";
    return new Object[][]{
        {a1, b1, e1},
        {a2, b2, e2}
    };
  }

  @Test(dataProvider = "dp")
  public void test(String a, String b, String e) {
    Assert.assertEquals(_0067AddBinary.addBinary(a, b), e);

  }
}
