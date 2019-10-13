package leetcode;

import com.personal.xwei.leetcode._0009PalindromeNumber;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _0009PalindromeNumberTests {

  @Test
  public void testOddTrue() {
    int x = 121;
    boolean expect = true;
    boolean actual = new _0009PalindromeNumber().isPalindrome(x);
    Assert.assertEquals(actual, expect);
  }

  @Test
  public void testEvenTrue() {
    int x = 1221;
    boolean expect = true;
    boolean actual = new _0009PalindromeNumber().isPalindrome(x);
    Assert.assertEquals(actual, expect);
  }

  @Test
  public void testZeroTrue() {
    int x = 0;
    boolean expect = true;
    boolean actual = new _0009PalindromeNumber().isPalindrome(x);
    Assert.assertEquals(actual, expect);
  }

  @Test
  public void testOddFalse() {
    int x = 122;
    boolean expect = false;
    boolean actual = new _0009PalindromeNumber().isPalindrome(x);
    Assert.assertEquals(actual, expect);
  }

  @Test
  public void testEvenFalse() {
    int x = 1231;
    boolean expect = false;
    boolean actual = new _0009PalindromeNumber().isPalindrome(x);
    Assert.assertEquals(actual, expect);
  }
}
