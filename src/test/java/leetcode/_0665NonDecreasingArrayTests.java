package leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _0665NonDecreasingArrayTests {

  @Test
  public void testTrue() {
    int[] a = new int[] {1, 4, 2, 3};
    Assert.assertTrue(_0665NonDecreasingArray.checkPossibility(a));
  }

  @Test
  public void testFalse() {
    int[] a = new int[] {4, 4, 2, 3};
    Assert.assertFalse(_0665NonDecreasingArray.checkPossibility(a));
  }
}
