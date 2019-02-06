package leetcode;

import com.personal.xwei.leetcode._0189RotateArray;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _0189RotateArrayTests {

  @DataProvider(name = "dp")
  public Iterator<Object[]> dataProvider() {
    List<Object[]> list = new ArrayList<>();
    int[] a1 = new int[] {1, 2, 3, 4, 5, 6};
    int k1 = 2;
    int[] e1 = new int[] {5, 6, 1, 2, 3, 4};
    Object[] oa1 = new Object[] {a1, k1, e1};
    list.add(oa1);

    int[] a2 = new int[] {1, 2, 3, 4, 5, 6};
    int k2 = 11;
    int[] e2 = new int[] {2, 3, 4, 5, 6, 1};
    Object[] oa2 = new Object[] {a2, k2, e2};
    list.add(oa2);
    return list.iterator();
  }

  @Test(dataProvider = "dp")
  public void test(int[] a, int k, int[] e) {
    _0189RotateArray.rotate(a, k);
    Assert.assertEquals(a, e);
  }
}
