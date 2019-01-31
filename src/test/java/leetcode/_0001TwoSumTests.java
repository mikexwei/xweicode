package leetcode;

import com.personal.xwei.leetcode._0001TwoSum;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _0001TwoSumTests {

  @Test
  public void testTwoSumAnswerExist() {
    _0001TwoSum solution = new _0001TwoSum();
    int[] input = new int[]{4, 6, 2, 3, 1, 8, 9};
    int target = 15;
    int[] expect = new int[]{1, 6};
    int[] actual = solution.twoSum(input, target);
    Assert.assertEquals(expect, actual);
  }
}
