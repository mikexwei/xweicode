package leetcode;

import com.personal.xwei.leetcode._0070ClimbingStairs;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _0070ClimbingStairsTests {
  @Test
  public void test() {
    int n = 5;
    int expect = 8;
    int actual = _0070ClimbingStairs.climbStairs(n);
    Assert.assertEquals(actual, expect);
  }
}
