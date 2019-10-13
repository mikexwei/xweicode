package com.personal.xwei.leetcode;

public class _0278FirstBadVersion {
  public static int counter = 0;
  private static boolean isBadVersion(int version) {
    counter++;
//    System.out.println(counter);
    return version < 1702766719 ? false : true;
  }

  public static int firstBadVersion(int n) {

    int min = 1;
    int max = n;
    if (isBadVersion(min)) return min;
    else {
      if (n == 2) return 2;
      else {
        while (max > min + 1) {
          int middle = (max+min)>>>1;
          if (isBadVersion(middle)) max = middle;
          else min = middle;
        }
        return max;
      }
    }
  }

  public static void main(String[] args) {
    System.out.println("---> " + String.valueOf(firstBadVersion(2126753390)));
//    System.out.println("---> " + String.valueOf(firstBadVersion(1024)));
    int i = 16;
    System.out.println(i>>1);
  }
}
