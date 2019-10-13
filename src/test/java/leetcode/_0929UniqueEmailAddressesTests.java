package leetcode;

import com.personal.xwei.leetcode._0929UniqueEmailAddresses;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _0929UniqueEmailAddressesTests {
  @Test
  public void testUniqueEmailAddress() {
    String[] emails = new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
    _0929UniqueEmailAddresses uea = new _0929UniqueEmailAddresses();
    int actual = uea.numUniqueEmails(emails);
    int expect = 2;
    Assert.assertEquals(actual, expect);
  }
}
