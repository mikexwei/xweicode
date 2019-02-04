package leetcode;

import com.personal.xwei.leetcode._0859BuddyStrings;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _0859BuddyStringsTests {
  @DataProvider(name = "dp")
  public Object[][] dataProvider() {
    String a1 = "";
    String b1 = "";
    boolean e1 = false;

    String a2 = "abababa";
    String b2 = "abababa";
    boolean e2 = true;

    String a3 = "abcde";
    String b3 = "abcde";
    boolean e3 = false;

    String a4 = "abcde";
    String b4 = "abcda";
    boolean e4 = false;

    return new Object[][] {
        {a1, b1, e1},
        {a2, b2, e2},
        {a3, b3, e3},
        {a4, b4, e4},
    };
  }

  @Test(dataProvider = "dp")
  public void test(String a, String b, boolean expect) {
    Assert.assertEquals(_0859BuddyStrings.buddyStrings(a, b), expect);
  }
}
