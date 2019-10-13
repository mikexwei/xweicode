package leetcode;

import com.personal.xwei.leetcode._0771JewelsAndStones;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _0771JewelsAndStonesTests {
  @Test
  public void testJewelsAndStones() {
    _0771JewelsAndStones jas = new _0771JewelsAndStones();
    String j = "aAb";
    String s = "aaaaacCaaaAaaBbbbbbbbccc";
    int expect = 18;
    int actual = jas.numJewelsInStones(j, s);
    Assert.assertEquals(actual, expect);
  }
}
