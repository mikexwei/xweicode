package leetcode;

import com.personal.xwei.leetcode._0007ReverseInteger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _0007ReverseIntegerTests {
  @Test
  public void testPositive() {
    _0007ReverseInteger solution = new _0007ReverseInteger();
    int input = 123;
    int expect = 321;
    int actual = solution.reverse(input);
    Assert.assertEquals(actual, expect);
  }

  @Test
  public void testNegative() {
    _0007ReverseInteger solution = new _0007ReverseInteger();
    int input = -123;
    int expect = -321;
    int actual = solution.reverse(input);
    Assert.assertEquals(actual, expect);
  }

  @Test
  public void testBoudry() {
    _0007ReverseInteger solution = new _0007ReverseInteger();
    int input = 0b10000000000000000000000000000000;
    int expect = 0;
    int actual = solution.reverse(input);
    Assert.assertEquals(actual, expect);
  }
}
