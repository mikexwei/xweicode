package leetcode;

import com.personal.xwei.leetcode._0069SqrtX;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class _0069SqrtXTests {
  @Test
  public void test() {
    for (int i = Integer.MAX_VALUE - 100; i < Integer.MAX_VALUE; i++) {
      int expect = (int) Math.sqrt((double)i);
      int actual = _0069SqrtX.mySqrt(i);
      Assert.assertEquals(actual, expect);
    }
    for (int j = 0; j < 100; j++) {
      int expect = (int) Math.sqrt((double)j);
      int actual = _0069SqrtX.mySqrt(j);
      Assert.assertEquals(actual, expect);
    }
  }
}
