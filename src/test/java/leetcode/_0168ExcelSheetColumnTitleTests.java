package leetcode;

import com.personal.xwei.leetcode._0168ExcelSheetColumnTitle;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _0168ExcelSheetColumnTitleTests {

  @DataProvider(name = "dp")
  public Object[][] dataProvider() {
    int n1 = 26;
    String s1 = "Z";

    int n2 = 27;
    String s2 = "AA";

    int n3 = 26*27 + 1;
    String s3 = "AAA";

    int n4 = 26 * 27;
    String s4 = "ZZ";

    return new Object[][] {
        {n1, s1},
        {n2, s2},
        {n3, s3},
        {n4, s4},

    };
  }
  @Test(dataProvider = "dp")
  public void test1(int n, String s) {
    Assert.assertEquals(_0168ExcelSheetColumnTitle.convertToTitle(n), s);
  }
}
