package leetcode;

import com.personal.xwei.leetcode._771JewelsAndStones;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _771JewelsAndStonesTests {
  @Test
  public void testJewelsAndStones() {
    _771JewelsAndStones jas = new _771JewelsAndStones();
    String j = "aAb";
    String s = "aaaaacCaaaAaaBbbbbbbbccc";
    int expect = 18;
    int actual = jas.numJewelsInStones(j, s);
    Assert.assertEquals(actual, expect);
  }
}
