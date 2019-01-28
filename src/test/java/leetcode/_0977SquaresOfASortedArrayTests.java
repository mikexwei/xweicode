package leetcode;

import com.personal.xwei.leetcode._0977SquaresOfASortedArray;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _0977SquaresOfASortedArrayTests {
  @Test
  public void testSquaresOfASortedArray() {
    int[] input = new int[] {-4,-3,1,3,10};
    _0977SquaresOfASortedArray solution = new _0977SquaresOfASortedArray();
    int[] expect = new int[] {1, 9, 9, 16, 100};
    int[] actual = solution.sortedSquares(input);
    Assert.assertEquals(actual, expect);
  }
}
