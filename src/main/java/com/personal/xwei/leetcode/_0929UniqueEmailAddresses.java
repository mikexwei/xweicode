package com.personal.xwei.leetcode;

import java.util.HashSet;
import java.util.Set;

public class _0929UniqueEmailAddresses {
  public int numUniqueEmails(String[] emails) {
    int origin = emails.length;
    int dupe = 0;
    Set emailSet = new HashSet();
    String processedEmail;
    String[] parts = new String[2];
    for (int i = 0; i < origin; i++) {
      parts = emails[i].split("@");
      processedEmail = parts[0].replaceAll("\\.", "").split("\\+")[0] + parts[1];
      if (emailSet.contains(processedEmail)) {
        dupe++;
      } else {
        emailSet.add(processedEmail);
      }
    }
    return origin - dupe;
  }
}
