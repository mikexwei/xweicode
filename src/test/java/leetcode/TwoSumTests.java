package leetcode;

import com.personal.xwei.leetcode.TwoSum;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TwoSumTests {

  @Test
  public void testTwoSumAnswerExist() {
    TwoSum.Solution solution = new TwoSum.Solution();
    int[] input = new int[] {4, 6, 2, 3, 1, 8, 9};
    int target = 15;
    int[] expect = new int[] {1, 6};
    int[] actual = solution.twoSum(input, target);
    Assert.assertEquals(expect, actual);
  }
}
